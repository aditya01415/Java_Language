public class maximumNumberInList {
    
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 4};
        int max = findMaximum(numbers);
        System.out.println("The maximum number in the list is: " + max);
    }

    public static int findMaximum(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
