// Nama :  Fitria Rahmadani
// NIM  :  M0521022

import java.util.Scanner;

public class PPBO_05_CharacterASCIIPrint {
    public static void main(String[] args) {
        char a, b, temp;
        String kar = "";

        Scanner sc = new Scanner(System.in);
        a = sc.next().charAt(0);
        b = sc.next().charAt(0);
        sc.close();

        if(a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        while(a <= b) {
            kar += a;
            a++;
        }

        System.out.println(kar);
    }

}
