// Nama :  Fitria Rahmadani
// NIM  :  M0521022

import java.util.Scanner;

public class PPBO_03_Latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total pembelian : ");
        
        // tambahkan code untuk menyimpan nominal total pembelian
        double totalBeli = sc.nextDouble();

        // tambahkan code untuk mengimplementasikan ketentuan diskon yang ditetapkan
        double diskon, hargaDiskon;

        if (totalBeli < 50000) {
            diskon = 0f;
        } else if (totalBeli >= 50000 && totalBeli <= 75000) {
            diskon = 0.05f;
        } else if (totalBeli >= 75000 && totalBeli <= 125000) {
            diskon = 0.15f;
        } else {
            diskon = 0.20f;
        }

        // tambahkan code untuk menampilkan nominal yang harus dibayar 
        // sesuai dengan ketentuan diskon yang diberikan
        hargaDiskon = totalBeli - (totalBeli*diskon);
        System.out.printf("Total Pembelian      = Rp %.2f\n", totalBeli);
        System.out.println("Diskon Barang        = " + (int)(diskon*100) + "%");
        System.out.printf("Harga setelah diskon = Rp %.2f\n", hargaDiskon);

        sc.close();
    }
}

// Seorang mahasiswa berbelanja di mini market. Mini market tersebut memberikan diskon kepada
// pembeli dengan ketentuan
// a. Diskon 0% jika total pembelian di bawah 50.000
// b. Diskon 5% jika total pembelian 50.000 hingga 75.000
// c. Diskon 15% jika total pembelian di atas 75.000 hingga 125.000
// d. Diskon 20% jika total pembelian di atas 125.000