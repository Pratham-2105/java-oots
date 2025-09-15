package Day3;

class DefaultDataTypes1 {
    static int i;
    static float f;
    static double d;
    static boolean bool;
    static char c;
    static short s;
    static byte b;

    public static void showDefault() {
        System.out.println(i);
        System.out.println(f);
        System.out.println(d);
        System.out.println(bool);
        System.out.println("'" + c + "'");
        System.out.println(s);
        System.out.println(b);
    }
}

public class defaultDataType {
    public static void main(String args[]) {
        DefaultDataTypes1.showDefault();
    }
}