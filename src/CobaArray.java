public class CobaArray {

    public static void main(String[] args) {
        int[] arrNilai = {5, 10, 1, 20, 30}; 
        int arrNilai2 [] = new int[5]; // tidak perlu menuliskan size saat isi array sudah tertulis
        arrNilai2[4]=100; // berada pada kolom terakhir karena array dimulai dari 0
        // i<arrNilai.length dibaca i kurang dari 5/sepanjang jumlah dari array itu
        for(int i=0; i<arrNilai.length; i++)//5, 10, 1, 20, 30
        {
            if(arrNilai[i]%2!=0) //saat if true maka dia masuk ke continue dan tidak menghiraukan apapun, langsung masuk ke for lagi ngecek loop lagi, jadi system out dibawahnya itu di skip
            {continue;         } // continue melakukan skip tetapi melanjutkan perulangan, setiap ketemu ganjil dia continue
            System.out.print(arrNilai[i]+" ");
            //break berlaku di for dimana dia berada, misal diletakkan di for dalam, maka dia akan langsung kembali di break luar, break dalam berhenti beroperasi dan menghailkan output yg sama paling terakhir

            // break/for hanya berpengaruh di tempat dia ditempatkan
        }
        
    }
}