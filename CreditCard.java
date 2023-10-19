import java.util.Scanner;
public class CreditCard {
    public long id;
    static int sum;
    public long balance;
    public CreditCard(long id,long balance){
        this.balance = balance;
        this.id = id;

    }
    public static void main(String[] args) {
        CreditCard Cc1 = new CreditCard(123456, 200);
        CreditCard Cc2 = new CreditCard(987654, 500);
        CreditCard Cc3 = new CreditCard(147258, 150);
        Scanner Sc = new Scanner(System.in);
        System.out.println("какая сумма снятия и зачисления?");
        sum = Sc.nextInt();
        Cc1.addsumCC(sum);
        Cc2.addsumCC(sum);
        Cc3.REmovesumCC(sum);
        System.out.println(Cc1.InfoCC());
        System.out.println(Cc2.InfoCC());
        System.out.println(Cc3.InfoCC());
    }
        public void addsumCC(long sum){ balance = balance + sum; }
public void REmovesumCC(long sum){balance= balance - sum; }
public String InfoCC(){
    return " номер счета: "+ this.id +" баланс счета: " + this.balance;}
}



