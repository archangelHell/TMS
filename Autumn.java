import java.util.Scanner;

    public class Autumn {
        public static void main(String[] args) {
            Scanner sw =new Scanner(System.in);

            System.out.println("write number month:");
            int month = sw.nextInt();

            switch (month) {
                case 1:  System.out.println("Winter");
                    break;
                case 2:  System.out.println("Winter");
                    break;
                case 3:  System.out.println("spring");
                    break;
                case 4:  System.out.println("spring");
                    break;
                case 5:  System.out.println("spring");
                    break;
                case 6:  System.out.println("Summer");
                    break;
                case 7:  System.out.println("Summer");
                    break;
                case 8:  System.out.println("Summer");
                    break;
                case 9:  System.out.println("Autumn");
                    break;
                case 10: System.out.println("Autumn");
                    break;
                case 11: System.out.println("Autumn");
                    break;
                case 12: System.out.println("Winter");
                    break;
                default: break;
            }
        }
    }