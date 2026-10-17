import java.util.Scanner;
public class LiveCodeUts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int angka = scan.nextInt();
        
        for (int i=1; i<=angka; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
                System.out.println();
        }

        // while (angka>=4);
        //     System.out.print("*" +i);

        // SOAL!!!
        // nested loop
        // input = 4
        // output = 
        // *
        // **
        // ***
        // ****
        
    }
}
