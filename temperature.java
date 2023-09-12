import java.util.Scanner;

public class temperature {
    public static void main(String[] args){
        Scanner tmp = new Scanner(System.in);

        System.out.println("write temperature on street:");
        int t = tmp.nextInt();
        if(t>-5){
            System.out.println("warm");
        } else if (t>-20) {
            System.out.println("normal,chill");
        } else if (t<-20){
            System.out.println("Cold,brrr");

        }
    }
}
