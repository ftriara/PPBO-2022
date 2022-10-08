// Nama :  Fitria Rahmadani
// NIM  :  M0521022

import java.util.Scanner;

public class PPBO_05_SimpleRegex {
    public static void main(String[] args) {
        String str;

        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        sc.close();

        if(str.matches("^[AIUEOaiueo].*")) {
            System.out.println(1);
        } else if(str.matches("^(.*[^ng](ng))")) {
            System.out.println(2);
        } else {
            System.out.println(-1);
        }
    }

}
