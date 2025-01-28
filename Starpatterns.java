 public class Starpatterns {
     public static void main(String[] args){
         int n = 4;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                 System.out.print("*");  // Use print to stay on the same line
            }             System.out.println();  // After printing stars in a row, move to the next line        }}
 }


 import java.util.Scanner;
 public class Starpatterns {
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
         System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();        
        int[] array = new int[size];
        System.out.println("Enter " + size + " elements:");
         for (int i = 0; i < size; i++) {
             System.out.print("Element " + (i + 1) + ": ");
             array[i] = sc.nextInt();
         }
        
          Print the elements of the array
        System.out.println("The elements of the array are:");
         for (int i = 0; i < size; i++) {
             System.out.println(array[i]);
         }
        
          Close the scanner object to prevent resource leak
         sc.close();
     }
 }


 import java.util.Scanner;
// public class Starpatterns {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);        
//         System.out.print("Enter the size of the array: ");
//         int size = sc.nextInt();
//         int[] array = new int[size];
//         System.out.println("Enter " + size + " elements:");
//         for (int i = 0; i < size; i++) {
//             System.out.print("Element " + (i + 1) + ": ");
//             array[i] = sc.nextInt();
//         }
//         int largest = array[0];
//         int smallest = array[0];
//         for (int i = 1; i < size; i++) {
//             if (array[i] > largest) {
//                 largest = array[i];
//             }
//             if (array[i] < smallest) {
//                 smallest = array[i];
//             }
//         }
//         System.out.println("The largest element is: " + largest);
//         System.out.println("The smallest element is: " + smallest);
//         sc.close();
//     }
// }


// public class Starpatterns {
//     public static void main(String[] args) {
//         int[][] matrix1 = {
//             {1, 2, 3},
//             {4, 5, 6},
//             {7, 8, 9}
//         };
//         int[][] matrix2 = {
//             {9, 8, 7},
//             {6, 5, 4},
//             {3, 2, 1}
//         };
//         int[][] sumMatrix = addMatrices(matrix1, matrix2);
//         int[][] diffMatrix = subtractMatrices(matrix1, matrix2);
//         System.out.println("Matrix 1:");
//         printMatrix(matrix1);
//         System.out.println("Matrix 2:");
//         printMatrix(matrix2);
//         System.out.println("Sum of matrices:");
//         printMatrix(sumMatrix);
//         System.out.println("Difference of matrices:");
//         printMatrix(diffMatrix);
//     }
//     public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
//         int rows = matrix1.length;
//         int cols = matrix1[0].length;
//         int[][] result = new int[rows][cols];
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 result[i][j] = matrix1[i][j] + matrix2[i][j];
//             }
//         }
//         return result;
//     }
//     public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
//         int rows = matrix1.length;
//         int cols = matrix1[0].length;
//         int[][] result = new int[rows][cols];
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 result[i][j] = matrix1[i][j] - matrix2[i][j];
//             }
//         }
//         return result;
//     }
//     public static void printMatrix(int[][] matrix) {
//         for (int i = 0; i < matrix.length; i++) {
//             for (int j = 0; j < matrix[i].length; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }



// public class Starpatterns {
//     public static void main(String[] args) {
//         int[][] matrix = {
//             {1, 2, 3},
//             {4, 5, 6},
//             {7, 8, 9}
//         };
//         System.out.println("Original Matrix:");
//         printMatrix(matrix);
//         int[][] transposedMatrix = transposeMatrix(matrix);
//         System.out.println("Transposed Matrix:");
//         printMatrix(transposedMatrix);
//     }
//     public static int[][] transposeMatrix(int[][] matrix) {
//         int rows = matrix.length;
//         int cols = matrix[0].length;
//         int[][] transposed = new int[cols][rows];
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 transposed[j][i] = matrix[i][j];
//             }
//         }
//         return transposed;
//     }
//     public static void printMatrix(int[][] matrix) {
//         for (int i = 0; i < matrix.length; i++) {
//             for (int j = 0; j < matrix[i].length; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }
