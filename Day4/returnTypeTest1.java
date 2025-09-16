public class returnTypeTest1 {
    public int add() {
        int x = 30;
        int y = 70;
        int z = x + y;
        return z;
    }

    public static void main(String[] args) {
        returnTypeTest1 test = new returnTypeTest1();
        int add = test.add();
        System.out.println(add);
    }
}