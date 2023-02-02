package TakeUForword;

public class RotateImageby90degree {


    public void rotate(int[][] matrix) {

        int n = matrix.length;
        int matr[][] = new int[n][matrix.length];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matr[j][n - i - 1] = matrix[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = matr[i][j];
            }
        }
    }
    public static void rotates(int[][] matrix) {

        for (int i = 0; i <matrix.length ; i++) {
            for (int j = i; j < matrix.length; j++) {
                int temp=0;
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        System.out.println();
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j < matrix.length/2; j++) {
                int temp=matrix[i][j];
               matrix[i][j]=matrix[i][matrix.length-1-j];
                matrix[i][matrix[0].length-1-j]=temp;
            }
        }
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr1 = { { 1, 0, 3 }, { 0, 5, 6 } ,{ 1, 3, 8 }};
        for (int i = 0; i <arr1.length ; i++) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[i][j]);
            }
            System.out.println( );
        }
        System.out.println();
 rotates(arr1);
    }
}
