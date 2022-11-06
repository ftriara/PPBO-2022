// Nama : Fitria Rahmadani
// NIM  : M0521022

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class PPBO_07_DataOutputStream {
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
		File outFile = new File("D:/PBO - Java/sample4.data");
		FileOutputStream outFileStream;
		try {
			outFileStream = new FileOutputStream(outFile);
			DataOutputStream outStream = new DataOutputStream(outFileStream);
			outStream.writeBytes(teks);
			outStream.close();
			System.out.println("file berhasil disimpan");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
        } catch (IOException i){
            i.printStackTrace();
        }
	}

	public static void main(String[] args) {
		PPBO_07_DataOutputStream it = new PPBO_07_DataOutputStream();
		// memanggil method ketikTeks
		String kalimat = it.ketikTeks();
		// memanggil method simpanTeks
		it.simpanTeks(kalimat);
	}
}

/*
Soal:
  1. Jalankan source code tersebut, buka file teks menggunakan text editor, jelaskan seperti apa hasilnya.
  2. Jelaskan perbedaan cara kerja dari PrintWriter.write() dan DataOutputStream.writeBytes()

Jawab:
  1. Jika source code tersebut dijalankan, maka user akan diminta untuk menginputkan teks atau kalimat.
     Dimisalkan user menginputkan kalimat "M0521022_Fitria Rahmadani", maka terminal akan menampilkan output "file berhasil disimpan".
	 Ketika file "sample4.data" dibuka, maka akan menampilkan kalimat yang diinputkan user yaitu "M0521022_Fitria Rahmadani".
	 Fungsi DataOutputStream digunakan untuk mencetak string untuk setiap karakter dalam bytes.

  2. Perbedaan cara kerja dari fungsi PrintWriter dan DataOutputStream adalah:
     Fungsi PrintWriter digunakan untuk data teks.
     Fungsi DataOutputStream digunakan untuk data biner.

 */
