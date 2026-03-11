package arrays;

import java.util.Scanner;

public class RotateRowsByK {
    public static void main(String[] args) {
        int[][] matrix={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of k: ");

        int k=sc.nextInt();
        int cols=matrix[0].length;
        

        for(int i=0;i<matrix.length;i++){
            int[] temp=new int[cols];

            for(int j=0;j<cols;j++){
                temp[(j+k)%cols]=matrix[i][j];
            }
            matrix[i]=temp;
        }

        for (int[] matrix1 : matrix) {
            for (int j = 0; j<cols; j++) {
                System.out.print(matrix1[j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
