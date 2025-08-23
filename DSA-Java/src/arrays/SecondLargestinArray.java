package arrays;

public class SecondLargestinArray {
    static void main() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(secondLargest(arr));
    }

    private static int secondLargest(int[] arr) {
        if(arr.length < 2) {
            return Integer.MIN_VALUE; // or throw an exception
        }

        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        int i;
        for (i = 0; i < arr.length; i++)
        {
            if (arr[i] > large)
            {
                second_large = large;
                large = arr[i];
            }

            else if (arr[i] > second_large && arr[i] != large)
            {
                second_large = arr[i];
            }
        }
        return second_large;
    }
}
