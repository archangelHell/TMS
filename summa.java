import java.util.Scanner;

public class summa {
    public static void main(String[] args){
        Scanner nu = new Scanner(System.in);
        System.out.println("number:");
        int n = nu.nextInt();
        int nub = 0;
        for (int a = 1; a<=n; a++){
            nub = nub + a;

        }
        System.out.println(nub);
    }
}