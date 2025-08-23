package sorting;

import java.util.Arrays;

import static sorting.SelectionSortDemo.swap;

public class InsertionSortDemo {
    public static void main(String[] args) {



        int[] arr = {12, 11, 13, 5, 6};
        insertion(arr);
        System.out.println("Sorted array using Insertion sort: "+ Arrays.toString(arr));
    }

    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                } else {
                    break;
                }
            }
        }
    }

}
