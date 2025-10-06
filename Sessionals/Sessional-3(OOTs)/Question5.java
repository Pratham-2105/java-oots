import java.util.TreeSet;

public class Question5 {
    public static void main(String[] args) {
        TreeSet<Integer> empIDs = new TreeSet<>();

        empIDs.add(102);
        empIDs.add(101);
        empIDs.add(104);
        empIDs.add(103);
        empIDs.add(102); // duplicate ignored

        System.out.println("Employee IDs (ascending): " + empIDs);

        System.out.println("TreeSet automatically sorts elements and ignores duplicates.");
        System.out.println("Compared to HashSet: TreeSet maintains order, but is slower due to sorting.");
    }
}
