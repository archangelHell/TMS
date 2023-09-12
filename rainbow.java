import java.util.Scanner;

    public class rainbow {
        public static void main(String[] args){
            Scanner sw =new Scanner(System.in);

            System.out.println("write number color:");
            int month = sw.nextInt();

            switch (month) {
                case 1 -> System.out.println("red");
                case 2 -> System.out.println("Orange");
                case 3 -> System.out.println("Yelow");
                case 4 -> System.out.println("Green");
                case 5 -> System.out.println("Blue");
                case 6 -> System.out.println("dark blue");
                case 7 -> System.out.println("purple");
            }

        }
    }

