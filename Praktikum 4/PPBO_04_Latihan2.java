// Nama : Fitria Rahmadani
// NIM  : M0521022

import java.util.InputMismatchException;
import java.util.Scanner;

public class PPBO_04_Latihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bil1, bil2;
        boolean lanjut = true;
        while (lanjut) {
            try {
                System.out.print("Ketik bilangan pertama : ");
                bil1 = sc.nextInt();
                System.out.print("Ketik bilangan kedua : ");
                bil2 = sc.nextInt();
                double hasil = Double.valueOf(bil1) / Double.valueOf(bil2);

                System.out.println(bil1 + " / " + bil2 + " = " + hasil);
                lanjut = false;
            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("Input salah, masukkan angka");
            }
        }

        sc.close();
    }
}

// Ketik huruf untuk digunakan sebagai input bilangan pertama kemudian klik ENTER. 
// Jelaskan perbedaannya dengan source code sebelumnya (Latihan1)!
/* Jawab: Pada program Latihan2 ketika user menginputkan huruf maka user akan diminta untuk menginputkan ulang melalui kode "try" karena
          program telah menangkap Exception pada "catch (...)", jadi program akan tetap berjalan. Sedangkan, pada Latihan1
          program akan mengalami error dan berhenti karena adanya InputMismatchException.
*/
