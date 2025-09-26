package Day8;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizationTest {
    public static void main(String[] args) {
        Locale enLocale = new Locale("en", "US");
        ResourceBundle enBundle = ResourceBundle.getBundle("MessagesBundle", enLocale);

        System.out.println("English (US): ");
        System.out.println(enBundle.getString("greeting"));
        System.out.println(enBundle.getString("inquiry"));
        System.out.println(enBundle.getString("farewell"));

        System.out.println();

        // Hindi (India)
        Locale hiLocale = new Locale("hi", "IN");
        ResourceBundle hiBundle = ResourceBundle.getBundle("MessagesBundle", hiLocale);

        System.out.println("Hindi (India): ");
        System.out.println(hiBundle.getString("greeting"));
        System.out.println(hiBundle.getString("inquiry"));
        System.out.println(hiBundle.getString("farewell"));
    }
}
