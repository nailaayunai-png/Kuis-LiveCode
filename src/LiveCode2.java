import java.util.Scanner;

public class LiveCode2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // String nama = "dina";
        // int umur = 20;
        // int tinggiBadan = 170;
        // int hasilPenjumlahan = umur + 5;
        // System.out.println(nama);
        // System.out.println(umur);
        // System.out.println(tinggiBadan + "cm");
        // System.out.println("umur 5 tahun lagi: " + hasilPenjumlahan);
    
        //Sebuah toko menjual barang dengan harga Rp25.000. Jika minimal membeli 4 barang, , diskon 10%, hitung total harga setelah diskon
        // /Scanner scan = new Scanner(System.in);
        // int harga = 25000;
        // int minimal = 4;
        // int barang; 
        // System.out.print("Membeli berapa barang? ");
        // barang = scan.nextInt();

        // int hargaSebelumDiskon = harga * barang;
        // double totalSetelahDiskon = hargaSebelumDiskon * 0.9;
        // if (barang <4) {
        //     System.out.println("Total harga: " + hargaSebelumDiskon);
        // } else {
        //     System.out.println("Total harga : " + totalSetelahDiskon);
        // }
        
        //Buat program yang menerima nilai ujian dan kehadiran. Mahasiswa dinyatakan lulus jika nilai ≥ 60 dan kehadiran ≥ 75%. Tampilkan hasilnya
        // int nilaiUjian;
        // System.out.print("Berapa nilai ujian kamu? ");
        // nilaiUjian = scan.nextInt();
        // int kehadiran;
        // System.out.print("Berapa persen kehadiran (angka saja)? ");
        // kehadiran = scan.nextInt();
        // if (nilaiUjian >= 60 && kehadiran >= 75) {
        //     System.out.println("Anda dinyatakan Lulus");
        // } else {
        //     System.out.println("Anda dinyatakan Gagal");
        // }

        //Buat kalkulator sederhana. Input dua angka dan sebuah operator (+, -, *, /). Gunakan switch-case untuk menentukan operasi yang dilakukan
        int angka1;
        System.out.print("Input angka 1: ");
        angka1 = scan.nextInt();
        String simbol;
        System.out.print("Input simbol: ");
        simbol = scan.next();
        int angka2;
        System.out.print("Input angka 2: ");
        angka2 = scan.nextInt();
        int hasilPenjumlahan = angka1 + angka2;
        int hasilPengurangan = angka1 - angka2;
        float hasilPembagian = angka1/angka2;
        int hasilPerkalian = angka1 * angka2;

        switch (simbol) {
            case "+":
                System.out.println("Hasil operasi: " + hasilPenjumlahan);
                break;
            case "-":
                System.out.println("Hasil operasi: " + hasilPengurangan);
                break;
            case "/":
                System.out.println("Hasil operasi: " + hasilPembagian);
                break;
            case "*":
                System.out.println("Hasil operasi: " + hasilPerkalian);
                break;
            default: 
                System.out.println("Invalid input");
                break;
        }

        //Masukan 3 angka tentukan angka terkecil
        // int angka1;
        // System.out.print("masukkan angka: ");
        // angka1 = scan.nextInt();
        // int angka2;
        // System.out.print("masukkan angka: ");
        // angka2 = scan.nextInt();
        // int angka3;
        // System.out.print("masukkan angka: ");
        // angka3 = scan.nextInt();
        // int terkecil = angka1;

        // if (angka2 < terkecil) {
        //     terkecil = angka2;
        // }
        // if (angka3 < terkecil) {
        //     terkecil = angka3;
        // }
        // System.out.println(terkecil + angka2 + angka3);
    }
}
