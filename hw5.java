import java.util.Random;
import java.util.Scanner;

public class hw5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row;
        int column;
        System.out.println("Enter count of rows in array ");
        row = scanner.nextInt();
        System.out.println("Enter count of columns in array ");
        column = scanner.nextInt();
        Random rand = new Random();
        int[][] array = new int[row][column];
        System.out.println("Array is: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = rand.nextInt(9);
                System.out.print(" " + array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Main diagonal is: "); //главная диагональ
        for (int i = 0; i < row; i++) {
            System.out.println( array[i][i] + " ");
        }
        System.out.println("Side diagonal is: ");//побочная диагональ
        for(int i = 0; i < row; i++) {
            System.out.println(array[i][row - i - 1] + " ");
        }
        System.out.println();
    }
}
