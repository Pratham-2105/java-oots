public class returnTypeTest2 {
    public int add(int x, int y) {
        int z = x + y;
        return z;
    }

    public static void main(String[] args) {
        returnTypeTest2 test = new returnTypeTest2();
        int sum = test.add(40, 50);
        System.out.println(sum);
    }
}