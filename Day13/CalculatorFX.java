package Day13;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Map;

public class CalculatorFX extends Application {

    private final TextField display = new TextField("0");

    // Calculator state
    private BigDecimal accumulator = BigDecimal.ZERO;
    private String current = "0";
    private String pendingOp = null; // "+", "-", "*", "/", "%"
    private boolean overwrite = true; // next digit overwrites (after op/=)
    private final MathContext MC = new MathContext(16, RoundingMode.HALF_UP);

    @Override
    public void start(Stage stage) {
        display.setEditable(false);
        display.setAlignment(Pos.CENTER_RIGHT);
        display.setPadding(new Insets(14));
        display.setStyle("-fx-font-size: 22px; -fx-background-color: white;");
        display.setFocusTraversable(false);

        GridPane grid = new GridPane();
        grid.setHgap(8);
        grid.setVgap(8);
        grid.setPadding(new Insets(12));

        // Row 0: display
        HBox top = new HBox(display);
        top.setPadding(new Insets(6, 6, 2, 6));
        GridPane.setColumnSpan(top, 4);
        grid.add(top, 0, 0);

        // Buttons layout
        String[][] keys = {
                { "C", "±", "⌫", "/" },
                { "7", "8", "9", "*" },
                { "4", "5", "6", "-" },
                { "1", "2", "3", "+" },
                { "0", ".", "%", "=" }
        };

        for (int r = 0; r < keys.length; r++) {
            for (int c = 0; c < keys[r].length; c++) {
                String k = keys[r][c];
                Button b = makeButton(k);
                grid.add(b, c, r + 1);
            }
        }

        Scene scene = new Scene(grid, 320, 420);

        // 1) Handle non-text/control keys with KeyCode
        scene.setOnKeyPressed(e -> {
            KeyCode code = e.getCode();

            // Digits (top row or numpad)
            if (code.isDigitKey()) {
                String txt = e.getText(); // "0".."9"
                if (txt != null && !txt.isEmpty())
                    onDigit(txt);
                return;
            }

            switch (code) {
                case ADD -> handle("+");
                case SUBTRACT -> handle("-");
                case MULTIPLY -> handle("*");
                case DIVIDE -> handle("/");
                case ENTER, EQUALS -> handle("=");
                case BACK_SPACE -> handle("⌫");
                case DELETE -> handle("C");
                case PERIOD, DECIMAL -> handle(".");
                case ESCAPE -> handle("C"); // optional: Esc clears
                default -> {
                    /* ignore */ }
            }
        });

        // 2) Handle typed characters (e.g., Shift+5 gives "%")
        scene.setOnKeyTyped(e -> {
            String ch = e.getCharacter();
            if ("%".equals(ch)) {
                handle("%");
                e.consume();
            }
        });

        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.show();
    }

    private Button makeButton(String label) {
        Button b = new Button(label);
        b.setMinSize(60, 56);
        b.setPrefSize(60, 56);
        b.setStyle(switch (label) {
            case "=", "+", "-", "*", "/", "%" ->
                "-fx-background-color:#3b82f6; -fx-text-fill:white; -fx-font-size:18px;";
            case "C", "⌫", "±" -> "-fx-background-color:#e5e7eb; -fx-font-size:16px;";
            default -> "-fx-background-color:#f9fafb; -fx-font-size:18px;";
        });
        b.setOnAction(e -> handle(label));
        return b;
    }

    private void handle(String key) {
        if (key.matches("\\d")) {
            onDigit(key);
            return;
        }
        switch (key) {
            case "." -> onDot();
            case "C" -> clearAll();
            case "⌫" -> backspace();
            case "±" -> negate();
            case "+", "-", "*", "/", "%" -> setOperator(key);
            case "=" -> evaluate();
            default -> {
                /* ignore */ }
        }
        updateDisplay();
    }

    private void onDigit(String d) {
        if (overwrite || current.equals("0"))
            current = d;
        else
            current += d;
        overwrite = false;
        updateDisplay();
    }

    private void onDot() {
        if (overwrite)
            current = "0";
        if (!current.contains("."))
            current += ".";
        overwrite = false;
    }

    private void setOperator(String op) {
        if (pendingOp == null) {
            accumulator = toBD(current);
        } else {
            accumulator = apply(accumulator, toBD(current), pendingOp);
        }
        pendingOp = op;
        overwrite = true;
    }

    private void evaluate() {
        if (pendingOp != null) {
            accumulator = apply(accumulator, toBD(current), pendingOp);
            current = strip(accumulator);
            pendingOp = null;
            overwrite = true;
        }
    }

    private void clearAll() {
        accumulator = BigDecimal.ZERO;
        current = "0";
        pendingOp = null;
        overwrite = true;
    }

    private void backspace() {
        if (overwrite)
            return;
        if (current.length() > 1)
            current = current.substring(0, current.length() - 1);
        else
            current = "0";
    }

    private void negate() {
        if (current.equals("0"))
            return;
        if (current.startsWith("-"))
            current = current.substring(1);
        else
            current = "-" + current;
    }

    private BigDecimal apply(BigDecimal a, BigDecimal b, String op) {
        try {
            return switch (op) {
                case "+" -> a.add(b, MC);
                case "-" -> a.subtract(b, MC);
                case "*" -> a.multiply(b, MC);
                case "/" -> b.compareTo(BigDecimal.ZERO) == 0
                        ? BigDecimal.ZERO
                        : a.divide(b, 12, RoundingMode.HALF_UP);
                case "%" -> a.remainder(b, MC);
                default -> b;
            };
        } catch (ArithmeticException ex) {
            return BigDecimal.ZERO;
        }
    }

    private BigDecimal toBD(String s) {
        if (s.equals("-"))
            return BigDecimal.ZERO;
        return new BigDecimal(s);
    }

    private String strip(BigDecimal bd) {
        String s = bd.stripTrailingZeros().toPlainString();
        return s.equals("-0") ? "0" : s;
    }

    private void updateDisplay() {
        display.setText(overwrite ? strip(toBD(current)) : current);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
