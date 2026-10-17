import java.util.Scanner;
public class Kasir {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double total = 0;
        int barang = 0;
        String lanjut = "y";
        
        while (lanjut.equalsIgnoreCase("y")) {
            System.out.println("Masukkan harga 1 barang: ");
            barang = input.nextInt();

            total += barang;

            System.out.println("masih ada barang lagi? (y/n) ");
            lanjut = input.next();

        } if (total  >= 100000) {
            double diskon = total * 10/100;
            System.out.println("Anda diberi diskon 10%");
            System.out.println("Total harga anda adalah: " + (total - diskon));
        } else {
            System.out.println("Total harga anda: " +total);
        }

        
    }
}
