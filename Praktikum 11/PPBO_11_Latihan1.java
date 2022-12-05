//  Nama    : Fitria Rahmadani
//  NIM     : M0521022

class MyThread extends Thread {
    int length;
    String marker;

    public MyThread(int length, String marker){
        this.length = length;
        this.marker = marker;

        var mainThread = Thread.currentThread().getName();
        System.out.println(this.getName() + " is created on " + mainThread);
    }

    @Override
    public void run(){
        int count = 0;
        while(count < length){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            count++;
            var progressString = getProgress(count, marker);
            System.out.println(this.getName() + ": " + progressString);
        }
    }

    private String getProgress(int count, String marker){
        var result = "";
        for(int i=0; i<count; i++){
            result+=marker;
        }

        return result;
    }
}

public class PPBO_11_Latihan1 {
    public static void main(String[] args) {
        System.out.println("Hello from thread '" + Thread.currentThread().getName() + "'\n");

        var thread1 = new MyThread(10, "#");
        var thread2 = new MyThread(5, ">");

        thread1.start();

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread2.start();
    }
}

/* 
 * Jawablah pertanyaan berikut
 * 1. Jelaskan mengapa program di atas tidak bisa dijalankan (memiliki error/exception)
 *    Jawab : Program di atas tidak bisa dijalankan karena tidak terdapat InterruptedException untuk
 *            menghandle interrupt akibat blocking methods seperti 'Thread.sleep()' dalam kasus ini.
 * 
 * 
 * 2. Jelaskan dan terapkan bagaimana cara mengatasinya. Kemudian, kumpulkan program dalam keadaan sudah bisa dijalankan
 *    Jawab : Cara mengatasinya dengan menambahkan 'try catch' untuk dapat menghandle InterruptedException.
 * 
 * 
 * 3. Jelaskan secara singkat algoritma program di atas
 *    Jawab : Program di atas membuat 2 thread baru yaitu Thread-0 dan Thread-1
 *            a. Thread-0 memiliki panjang 10 yang artinya akan mencetak '#' sebanyak i=1 hingga i=10
 *               dimana '#' akan dicetak sebanyak i kali di setiap iterasi.
 *            b. Thread-1 memiliki panjang 5 yang artinya akan mencetak '>' sebanyak i=1 hingga i=5
 *               dimana '>' akan dicetak sebanyak i kali di setiap iterasi.
 * 
*/