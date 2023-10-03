import java.util.Arrays;

public class w5t6 {
    public static void main(String[] args) {
        int[][] num = {{5, 4, 45, 12}, {7, 5, 8, 85},};
        for (int[] ints : num) {
            Arrays.sort(ints);
        }
        for (int[] ints : num) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }
}

