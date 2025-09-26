package Day9;

public class EqualMethods {
    public static void main(String[] args) {
        // does == checks for objects rather than value? -> YES

        String str1 = new String("Hello");
        String str2 = new String("Hello"); // this forces JVM to create a new object in the heap;
        String str3 = str1;

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);

        System.out.println();

        // does .equals() checks for the actual value/data in th string object; -> YES

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));

        /*
         * But, all the objects in the Heap --> String Pool and point to the
         * samme LITERAL if the value of both the objects is same.
         * 
         * MAIN STACK ------- HEAP ---- STRING POOL
         * str1 ---------> obj1("Hello") "Hello"
         * str2 ---------> obj2("Hello")
         * str3 ---------> obj1()
         * 
         * All the objects in HEAP point to the STRING POOL;
         * 
         * [ (==) checks for the reference of the variables and since
         * str1 and str2 point to different object --> false,
         * but str1 and str3 point to the same object --> true ]
         * 
         * [ (.equals()) checks and compares the acutal STRING VALUE/LITERAL, so
         * since all the three refrences point to the same LITERAL in the
         * STRING POOL, all of them have the same value and thus all comparisons
         * are true.]
         */
    }
}
