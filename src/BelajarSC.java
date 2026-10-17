public class BelajarSC {
    public static void main (String[] Args) {
        int angka1 = 0; //deklarasi awal
        int angka2 = 0;
        
        // for(angka2 = 1; angka2 <=10; angka++) //angka++ = angka+1
        // {
        //     System.out.println("angka = " +angka); //mencetak 10, lalu kembali ke atas lagi
        // }
        // System.out.println("angka terakhir = " +angka); //keluar menjadi 10+1=11

       int i = 0; //kalau tidak di declare disini (fungsi main) maka tidak bisa terpanggil di i terakhir
        for(i=0; i<10; i++) //ditambah 1 jadi 6
        {
            if(i>5)
            {
                break; //keluar
            }
            System.out.println("i = " +i); //5
        }

        System.out.println("i terakhir = " +i); //i=6
       
    } //for(;;) maka dia tidak akan berhenti dan akan terus looping, terpakai pada aplikasi yang ada user interfacenya,seperti vscode ini.
}