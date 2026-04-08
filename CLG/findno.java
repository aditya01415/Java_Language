//wap to find number less than 7 in a tree set of integer values.
import java.util.TreeSet;
public class findno {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(3);
        ts.add(5);
        ts.add(7);
        ts.add(9);
        System.out.println("TreeSet: " + ts);
        System.out.println("Numbers less than 7: " + ts.headSet(7));
    }
}
