import java.util.Scanner;

public class phone2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        public static void PhoneTask()
    {       Phone jojo = new Phone();
            Phone Honor = new Phone(295009514, "Honor 5 I", 200);
            Phone Imonor = new Phone(294007892, "Imonor 8 Pro", 80);
            Honor.receiveCall("Honor 5 I", 56892);
            jojo.receiveCall("jojo", 215983);
            System.out.println("Phone 1: ");
            Honor.showInfo();
            System.out.println("Phone 2: ");
            jojo.showInfo();
            System.out.println("Phone 3: ");
            Imonor.showInfo();
            ///////////////////////////////////////////////////
            System.out.print("Enter count of phone numbers u want to send message: ");
            int count = sc.nextInt();
            String[] numbers = new String[count];
            System.out.println("Enter phone numbers:");
            for (int i = 0; i < count; i++) {
                numbers[i] = sc.next();
            }
            jojo.sendMessage(numbers);
        }
    }
}
