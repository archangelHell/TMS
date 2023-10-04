import java.util.Arrays;
import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем
        int[] array = new int[size];
        System.out.println("Insert array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();// Заполняем массив элементами
        }
        System.out.println("Enter needed massive: ");
        int massive = input.nextInt();
        boolean mas = Arrays.stream(array).anyMatch(i -> i == massive); //проверка
        System.out.println(mas); //вывод false или true
    }
}
