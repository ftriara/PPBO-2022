// Nama : Fitria Rahmadani
// NIM  : M0521022

package com.java.p8a;

import com.java.p8.Buku;

public class BukuInherit extends Buku {
    public BukuInherit(String isbn, String judul, String penulis, String penerbit, int tahunTerbit) {
        super(isbn, judul, penulis, penerbit, tahunTerbit);
        super.isbn = isbn;
        super.judul = judul;
        super.penulis = penulis;
        super.penerbit = penerbit;
        super.tahunTerbit = tahunTerbit;
    }
}

/*
 Soal:
 Adakah error yang ditemui pada BukuInherit yang berkaitan dengan access modifier? Jelaskan penyebab errornya!

 Jawab:
 Terdapat error saat mengeksekusi source code yang berkaitan dengan access modifier.
 Error tersebut diantaranya:
 1. Variabel "penulis" dari dari class "Buku" dalam package com.java.p8 memiliki access modifier private 
    sehingga variabel "penulis" hanya dapat diakses dalam class "Buku" dan tidak dapat diakses dari class lainnya.
 2. Variabel "isbn" dan "tahunTerbit" dari class "Buku" dalam package com.java.p8 memiliki access modifier default
    sehingga hanya dapat diakses di dalam class "Buku" dan class yang berada dalam package yang sama.
    Sedangkan, class "BukuInherit" berada di package yang berbeda yaitu p8a sehingga kedua variabel
    tersebut tidak dapat diakses.
 */