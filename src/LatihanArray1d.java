public class LatihanArray1d {
    // jumlahkan 2 buah array yang sizenya identik A[10], B[10], gunakan perulangan untuk menjumlahkannya A+B=C dan hasilnya simpan di C[10], tampilkan C10
public static void main(String[] args) {
    int[] arrA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] arrB = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] arrC = new int[10];

    for(int i=0; i<10; i++)
    {
        arrC[i] = arrA[i] + arrB[i];
        System.out.println(arrC);
    }

}
}
