package arrays;

public class SmallestInArray {
    static void main() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(smallest(arr));
        System.out.println(secondSmallest(arr));
    }

    private static int smallest(int[] arr) {
        if (arr.length == 0) {
            return Integer.MAX_VALUE; // or throw an exception
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static int secondSmallest(int[] arr) {
        if (arr.length < 2) {
            return Integer.MAX_VALUE; // or throw an exception
        }

        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < small) {
                second_small = small;
                small = arr[i];
            } else if (arr[i] < second_small && arr[i] != small) {
                second_small = arr[i];
            }
        }
        return second_small;
    }
}
