// Nama : Fitria Rahmadani
// NIM  : M0521022

package com.java.p8a;

public class ClassX {
    public static void main(String[] args) {
        // buat objek buku
        Buku buku = new Buku("432A326B4", "Pengenalan Komputasi Cloud", "Eri Suhardi", "Elex Media Komputindo", 2022);
        // tampilkan data buku lewat method printDataBuku
        buku.printDataBuku();
        // akses ke variabel yang ada di objek buku
        System.out.println(buku.isbn);
        System.out.println(buku.judul);
        System.out.println(buku.penulis);
        System.out.println(buku.penerbit);
        System.out.println(buku.tahunTerbit);
    }
}

/*
 Soal:
 Adakah error yang ditemui pada ClassX yang berkaitan dengan access modifier? Jelaskan penyebab errornya!

 Jawab:
 Terdapat error saat mengeksekusi source code yang berkaitan dengan access modifier. Error tersebut disebabkan
 oleh pembuatan objek buku dari class "Buku", sedangkan class "Buku" tidak ada dalam package com.java.p8a.
 class "Buku" yang dimaksud berada dalam package (com.java.p8), sedangkan class "ClassX" berada dalam
 package (com.java.p8a).
 */