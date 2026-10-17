public class Percobaan2 {
//     public static void main(String[] args) {
//         int nilai = 470;
//         // pisahkan 4 = ratusan, 70 = puluhan, satuan = 9 angka, operasi pembagian
//         int = angka/100;
//         int = (angka/10)%10;
//         int = angka%10;
//     }
// }

// public class BreakContinuje{
    public static void main(String[] args){
        int nilai;
        System.out.println("pernyataan break batas 10");
        for(nilai = 1; nilai<=10; nilai++){
            if(nilai == 5)
                break;
            else
                System.out.println(nilai);
        }
        System.out.println();
        System.out.println("pernyataan con tontinue batas 10");
        for(nilai = 1; nilai<=10; nilai++){
            if(nilai==5)
                continue;
            else
                System.out.println(nilai);
        }
    }
}
