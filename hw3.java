public class hw3 {
    public static void main(String[]args){
        Integer[][] arrA = {{1,0,0,0},{0,1,0,0},{0,0,0,0}}; //заполняем массивы
        Integer[][] arrB = {{1,2,3},{1,1,1},{0,0,0},{2,1,0}};
        int a = arrA.length;
        int b = arrB[0].length;
        int o = arrB.length;
        int[][] res = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                for (int k = 0; k < o; k++) {
                    res[i][j] += arrA[i][k] * arrB[k][j];
                }
            }
        }
        for (int[] re : res) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.format("%6d ", re[j]);
            }
            System.out.println();
        }
    }
}
