import java.util.Scanner;
public class chetnoeilinet {

        public static void main(String[] args) {
            Scanner num = new Scanner(System.in);
            System.out.println("Write number:");
            int number = num.nextInt();
            if (number % 2 == 0) {
                System.out.print("четное");
            } else if (number % 1 == 0) {
                System.out.print("не четное");
            }
        }
    }

