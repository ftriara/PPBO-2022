// Nama :  Fitria Rahmadani
// NIM  :  M0521022

public class PPBO_03_Latihan3 {
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 3};
        //ForLoop Sebelum
        /*for (int i = 1; i < 6; i++) {
            System.out.println("elemen ke-" + i + " = " + arr[i]);
        }*/

        //ForLoop Sesudah Perbaikan
        for (int i = 0; i < 5; i++) {
            System.out.println("elemen ke-" + (i+1) + " = " + arr[i]);
        }
    }
}

// Berikut ini adalah code untuk menampilkan elemen (anggota) sebuah array yang berupa bilangan
// integer, mulai dari elemen pertama hingga terakhir.

// Eksekusi source code tersebut dan jelaskan apakah penulisan kode perulangan dengan for pada code
// tersebut sudah tepat dan tuliskan perbaikan apabila diperlukan!

// Jawab: Kode perulangan di atas belum tepat karena perulangan dimulai dari indeks satu. Seharusnya pada Java perulangan dimulai dari 
//        indeks nol. Jika perulangan dimulai dari indeks 1 seperti di atas maka nilai 5 tidak akan tercetak. Oleh karena itu, variabel i
//        seharusnya bernilai 0 hingga 4. Jika ingin mengakses indeks ke-0 atau elemen 1 maka pada output variabel i ditambah 1 (i+1).
//        Perlu diberi tanda kurung sehingga tidak menimbulkan kerancuan.