public class kvadrati {
    public static void main(String[] args){
        int a = 10; // Начальное число
        int b = 20; // Конечное число

        for (int i = a; i <= b; i++){
            System.out.printf("Значение " + i + " квадрат равeн %.0f \n", Math.pow(i, 2));
        }
    }
}