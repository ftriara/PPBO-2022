// Nama : Fitria Rahmadani
// NIM  : M0521022
public class PPBO_02_Latihan2 {
    public static final int KURS_DOLLAR = 15000;
    public static final double PI = 3.14;
    public static final String NAMA = "Squidward";
    public static void main(String args[]) {
        KURS_DOLLAR = 13500;
        System.out.println(KURS_DOLLAR);
        System.out.println(PI);
        System.out.println(NAMA);
    }
}
// Apa yang salah dengan source code tersebut?
// Jawaban : Source code tersebut salah karena variabel KURS_DOLLAR dideklarasikan konstan sehingga apabila variabel tersebut
//           diubah valuenya seperti pada line 8 maka akan menyebabkan error.
//
// Apa maksud penggunaan keyword static sebelum keyword final pada deklarasi variabel tersebut?
// Jawaban : Penggunaan keyword static sebelum keyword final berfungsi supaya sebuah variabel dapat diakses langsung tanpa melalui objek
//           dari class tersebut, hanya melalui nama classnya saja.
