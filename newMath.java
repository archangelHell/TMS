public class newMath {

        public static void main(String[] args) {
            int [] array = new int[10];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int)(Math.random()*90+10);
            }
            System.out.println("Случайный массив:");
            for (int j : array) {
                System.out.print(j + "\t");
            }
            System.out.println();


            int maxValue = array[0]; // 1. Максимальное значение
            for (int i = 1; i < array.length; i++) {
                if(maxValue < array[i]){
                    maxValue = array[i];
                }
            }
            System.out.println("Максимальное значение:"+maxValue);


            int minValue = array[0];// 2. минимальное значение
            for (int i = 1; i < array.length; i++) {
                if(minValue > array[i]){
                    minValue = array[i];
                }
            }
            System.out.println("Минимальное значение:"+minValue);


            int sum = 0;// 3. Вместе
            for (int j : array) {
                sum += j;
            }
            System.out.println("Сумма элементов массива такова:"+sum);


            int avgValue = sum/ array.length;// 4. Среднее
            System.out.println("Среднее значение:"+avgValue);
        }
    }