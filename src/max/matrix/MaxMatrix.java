package max.matrix;

import java.util.Scanner;

public class MaxMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter row matrix: ");
        int row = scanner.nextInt();
        System.out.print("Enter column matrix: ");
        int col = scanner.nextInt();

        double[][] matrix = new double[row][col];
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                matrix[i][j] = (int) Math.floor(Math.random()*1000);
//                System.out.print("Enter Element: ");
//                matrix[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("The Element Array List: ");
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%-7.1f", matrix[i][j]);
//                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        double max = matrix[0][0];
//        int indexRow = 1;
//        int indexCol = 1;

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
//                    indexRow = i + 1;
//                    indexCol = j + 1;
                }
            }
        }

        String maxPosition = "";
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                if (max == matrix[i][j]) {
                    max = matrix[i][j];
                    maxPosition +="["+ i +"]["+ j +"]";
                }
            }
        }

        System.out.printf("The largest property value in the list is : %.1f at position %s", max, maxPosition);

//        System.out.println("The largest property value in the list is " + max + " ,at position row " + indexRow +" ,at position column " + indexCol);
    }
}
