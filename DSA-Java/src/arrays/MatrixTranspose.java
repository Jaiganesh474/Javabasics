package arrays;

public class MatrixTranspose {
    public static void TransposeMatrix(int[][] matrix){
        int n=matrix.length;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }

    public static void PrintMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.err.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrix={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.err.println("Original Matrix:");
        PrintMatrix(matrix);
        TransposeMatrix(matrix);
        System.err.println("Transposed Matrix:");
        PrintMatrix(matrix);
    }
}
