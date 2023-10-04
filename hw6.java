import java.util.Arrays;

public class hw6 {
    public static void main(String[] args) {
        int[][] num = {{5, 4, 45, 1}, {7, 5, 8, 85},};
        for (int[] ints : num) {
            Arrays.sort(ints); // сортировка
        }
        for (int[] ints : num) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }
}


