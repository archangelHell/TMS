import java.util.Arrays;
import java.util.Scanner;

public class massive2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int deletenum;
        System.out.println("Enter the size of the array that is to be created:");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array :");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the elements for remove from array :");
        deletenum = sc.nextInt();
        for (int currentElement : array) {
            if (deletenum == currentElement) {
                count++;
                int[] resultMas = new int[array.length - count];
                int index = 0;
                for (int j : array) {
                    if (j != deletenum) {
                        resultMas[index] = j;
                        index++;
                    }
                }
                System.out.println("Result: "+ Arrays.toString(resultMas));
            }
        }
        if (count == 0){
            System.out.println(" Number are not in mas "+ Arrays.toString(array));
        }
    }
}





