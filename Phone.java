import java.util.Arrays;

public class Phone {
    public static void main(String[]args){
    }
    int number;
    String model;
    int weight;
    void receiveCall(String model, int number){
        System.out.println("Coller's model of the phone:" + model);
        System.out.println("Coller's number:" + number);
    }
    public int getNumber(){
        return number;
    }
    Phone(int number, String model, double weight){
        this(number, model);
        this.weight = (int) weight;
    }
    Phone(int number, String model){
        this.number = number;
        this.model = model;
    }
    Phone(){
        number = 956478;
        model = "Honor 10I ";
        weight = 200;
    }
    public void showInfo(){
        System.out.println("number is " + getNumber());
        System.out.println("model is " + model);
        System.out.println("weight is " + weight);
    }public void sendMessage() {
        System.out.println("Send message -- " + Arrays.toString(new int[]{number}));
    }
}
