public class LatihanArray2d {
    public static void main(String[] args) {

        // A               B                 C = (A+B)
        // 3 10 200        7 10 800          10 20 1000
        // 4 100 5         6 100 5           10 200 10
        // 8 8 8           2 2  2            10 10 10

        int arrA[][] = new int[][]{{3, 10, 200}, {4, 100, 5}, {8, 8, 8}};
        int arrB[][] = new int[][]{{7, 10, 800}, {6, 100, 5}, {2, 2, 2,}};
        int arrC[][] = new int[3][3];

        System.out.println();

        for(int i=0; i<1; i++){
            for(int j=0; j<arrB; j++){
                arrC[i][j] = arrA[i][j] + arrB[i][j];
                System.out.println(arrC);
            }
        }

        // int arr2D[][] = new int[2][3]; //semuanya berisi angka 0
        // int brr2D[][] = new int[][]{{10,7,10}, {6,3,10}}; // dua baris tiga kolom
        // int crr2D[][] = new int[][]{{10,7,10}, {3,10}}; // [0] berisi 3 kolom, [1] berisi 2 kolom

        // System.out.println("ukuran arr[0][1] = "+arr2D[0][1].length);
        // System.out.println("ukuran arr[1][2] = "+brr2D[1][2].length);
        // System.out.println("ukuran arr[1][1] = "+crr2D[1][2].length);
       
        // System.out.println("ukuran arr = "+arr2D[0].length); jumlah 
        // System.out.println("ukuran arr = "+brr2D[1].length);
        // System.out.println("ukuran arr = "+crr2D[1].length);
    }
}
