public class hw4{
    public static void main(String[] args){

        double sumMas1=0,sumMas2=0;// среднее арифмитическое

        int[] Mas1 = new int[5]; //Создадаем первый массив и выводим.
        for(int i=0;i<Mas1.length;i++){
            Mas1[i]=(int)(Math.random()*6);
            System.out.print(Mas1[i] +" ");

            sumMas1+=(double)Mas1[i]/Mas1.length;//Посчитаем и сохраним среднее арифметическое первого массива
        }
        System.out.println(" ");

        int[] Mas2=new int[5];//Создадаем и выведем  второй массив
        for(int i=0;i<Mas2.length;i++){
            Mas2[i] =(int)(Math.random()*6);
            System.out.print(Mas2[i] +" ");
            sumMas2+=(double)Mas2[i]/Mas2.length;
        }
        System.out.println(" ");
        //Сравним и выведем по условию средеарифметическое какого массива больше
        if(sumMas1==sumMas2)System.out.println("Средние арифметические значения двух массивов равны");
        else {if(sumMas1>sumMas2)
            System.out.println("Среднее арифметическое значение первого массива больше и равно :  ");
        else System.out.println("Среднее арифметическое значение второго массива больше и равно :");
        }
    }
}

