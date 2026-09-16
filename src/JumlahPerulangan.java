import java.util.Scanner;

public class JumlahPerulangan {

    public static void main(String[] args) {

        int x;
        int y;
        System.out.println("Masukkan jumlah perulangan!");
        Scanner scan = new Scanner(System.in);
        y = scan.nextInt();
        x = 1;
        while (x <= y) {
            System.out.println("Angka urut = " +x);
            x = x+1;

        }


    }

}
