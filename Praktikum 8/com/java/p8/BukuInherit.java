// Nama : Fitria Rahmadani
// NIM  : M0521022

package com.java.p8;

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
 Terdapat error saat mengeksekusi source code yang berkaitan dengan access modifier. Error tersebut disebabkan
 oleh variabel "penulis" dari class "Buku" dalam package com.java.p8 memiliki access modifier private sehingga
 variabel "penulis" hanya dapat diakses dalam class "Buku" dan tidak dapat diakses dari class lainnya meskipun
 dalam package yang sama.
 */