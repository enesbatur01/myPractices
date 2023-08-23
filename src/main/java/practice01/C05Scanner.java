package practice01;

import java.util.Scanner;

public class C05Scanner {
    public static void main(String[] args) {

            /*
    kullanıcıdan aldıgınız sayının karesini bulunuz bulunuz
    not:bir sayının karesi,sayının kendisi ile carpımına esittir
     */

        Scanner sayiGiris = new Scanner(System.in);

        System.out.println("sayı girin :");

        int sayi = sayiGiris.nextInt();



        System.out.println("karesi " + sayi*sayi);



    }
}
