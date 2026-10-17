
public class Percobaan {
    public static void main(String[] args) {
       int tanggal = 5;
       int hariBerikutnya = 27;
       int hari = ((hariBerikutnya-tanggal) %7);
        
       // jika tanggal 5 itu senin, maka tanggal 27 hari apa?
       //tgl 7 = rabu
       //kelipatan, 2x, tgl 27 = selasa, 22/7 = 3 sisa 1 

       switch (hari) {
        case 0:
            System.out.println("Rabu");
            break;
        case 1:
            System.out.println("Kamis");
            break;
        case 2: 
            System.out.println("Jumat");
            break;
        case 3:
            System.out.println("Sabtu");
            break;
        case 4:
            System.out.println("Minggu");
            break;
        case 5:
            System.out.println("Senin");
            break;
        case 6: 
            System.out.println("Selasa");
        default: System.out.println("Invalid");
            break;
       }
        
    }
}
