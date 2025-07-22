package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            System.out.print("Enter array element at "+i+"th Position ");
            arr[i]=sc.nextInt();
        }
        System.out.println("The resulted array is "+ Arrays.toString(arr));

    }
}
