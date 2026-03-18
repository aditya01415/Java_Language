public class countSpecificString {
    
    public static void main(String[] args) {
        String str = "This code is belong to Aditya Yadav (2400320100103)";
        String specificString = "Aditya";
        int count = 0;

        String[] words = str.split(" ");

        for (String word : words) {
            if (word.equals(specificString)) {
                count++;
            }
        }

        System.out.println("The string '" + specificString + "' appears " + count + " times in the given string.");
    }
    
}
