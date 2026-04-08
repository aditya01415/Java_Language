// wap to add all element from a tree set to another tree set
import java.util.TreeSet;
public class addele {
    public static void main(String[] args) {
        TreeSet<String> set1 = new TreeSet<>();
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Cherry"); 
        TreeSet<String> set2 = new TreeSet<>();
        set2.addAll(set1);
        System.out.println("Elements in set1: " + set1);
        System.out.println("Elements in set2: " + set2);        
    }
} 