package searchtechniques.linearsearch;

import java.util.ArrayList;

public class LinearSearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5};
        int target = 6;
        boolean found = findElement(arr, target, 0);
        findAllIndex(arr, 4, 0);
        System.out.println(list);
//        if (found) {
//            System.out.println("Element " + target + " found in the array.");
//        } else {
//            System.out.println("Element " + target + " not found in the array.");
//        }
    }

    static boolean findElement(int[] arr, int target, int index) {
        if(index== arr.length) {
            return false; // Base case: reached the end of the array
        }
        return arr[index] == target || findElement(arr, target, index + 1);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);
    }
}


