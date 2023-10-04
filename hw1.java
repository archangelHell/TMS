import java.util.Arrays;
import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] RArray = new int[3][3];

        System.out.println("Insert array elements:");
        for (int i = 0; i < RArray.length; i++) {
            RArray[i] = new int[]{sc.nextInt()};// Заполняем массив элементам
        }
        for (int j = 0; j < RArray.length; j++) {
            RArray[j] = new int[]{sc.nextInt()};
            ;// Заполняем массив элементами

        }
        System.out.println(Arrays.deepToString(RArray));
    }
}

