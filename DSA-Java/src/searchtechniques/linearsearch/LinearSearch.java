package searchtechniques.linearsearch;

public class LinearSearch {
    static void main() {
        int [] arr = {1, 2, 3, 4, 3, 6, 7, 8, 9};
        int target = 3;
        int result = linearSearch(arr, target);
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    private static int linearSearch(int[] arr, int target) {
        if(arr == null || arr.length == 0) {
            return -1; // Array is empty or null
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i; // Return the index if the element is found
            }
        }
        return -1; // Return -1 if the element is not found
    }
}
