// Nama : Fitria Rahmadani
// NIM  : M0521022

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class PPBO_07_PrintWriter {
	// method ini untuk input teks oleh user melalui keyboard
	public String ketikTeks() {
		System.out.println("Ketik kalimat yang akan disimpan :");
		Scanner sc = new Scanner(System.in);
		// ambil 1 kalimat, setelah tekan enter teks akan diambil
		String str1 = sc.nextLine();
		sc.close();
		return str1;
	}

	// untuk menyimpan teks yang diketik user ke file
	public void simpanTeks(String teks) {
		// set up file and stream
		// ganti path "/tmp/sample3.data" dengan alamat file di komputer anda
		File outFile = new File("D:/PBO - Java/sample3.data");
		FileOutputStream outFileStream;
		try {
			outFileStream = new FileOutputStream(outFile);
			PrintWriter outStream = new PrintWriter(outFileStream);
			outStream.print(teks);
			outStream.close();
			System.out.println("file berhasil disimpan");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		PPBO_07_PrintWriter it = new PPBO_07_PrintWriter();
		// memanggil method ketikTeks
		String kalimat = it.ketikTeks();
		// memanggil method simpanTeks
		it.simpanTeks(kalimat);
	}
}

/*
 Soal:
  Jalankan source code tersebut, buka file teks menggunakan text editor, jelaskan seperti apa hasilnya.

 Jawab:
  Jika source code tersebut dijalankan, maka user akan diminta untuk menginputkan teks atau kalimat.
  Dimisalkan user menginputkan kalimat "M0521022_Fitria Rahmadani", maka terminal akan menampilkan output "file berhasil disimpan".
  Ketika file "sample3.data" dibuka, maka akan menampilkan kalimat yang diinputkan user yaitu "M0521022_Fitria Rahmadani".
  Source code dapat menyimpan data karena terdapat fungsi PrintWriter untuk menulis atau menyimpan data string
  ke dalam format ASCII.
 */