// Nama :  Fitria Rahmadani
// NIM  :  M0521022

import java.util.Scanner;

public class PPBO_05_StringMethod {
    public static void main(String[] args) {
        String str;
        int size;

        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        sc.close();

        size = str.length();
        for(int i = 0; i < size; i+=3) {
            System.out.print(str.charAt(i));
        }
    }

}
