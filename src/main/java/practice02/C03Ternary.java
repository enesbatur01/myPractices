package practice02;

import java.util.Scanner;

public class C03Ternary {

    public static void main(String[] args) {

          /*
            Kullanıcıdan bir sayı sisteme girmesini isteyin
            Ternary kullanarak;
            Girilen sayı çift ise konsola "Cift Sayi" yazdirin
            Girilen Sayi tek ise girilen sayıyı 3 artırarak konsola yazdırınız.
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter any number...");
        int num = input.nextInt();

        Object result = num%2 == 0 ? "Sayı çifttir..." :  num + 3;
        System.out.println("result = " + result);

    }

}
