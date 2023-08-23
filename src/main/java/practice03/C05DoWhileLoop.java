package practice03;

import java.util.Scanner;

public class C05DoWhileLoop {

    public static void main(String[] args) {

         /*
          Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
          Kullaniciya bitirmek istediginde 0'a basmasini soyleyin

          kullanici bitirmek istediginde
          toplam kac adet pozitif tam sayi girdigini
          ve bunlarin toplaminin kac oldugunu yazdirin

          Kullanici negatif sayi girerse
          "negatif sayi kullanamazsiniz " yazdirin
          bu negatif sayiyi sayi adedine ve toplama eklemeyin
         */
        Scanner input = new Scanner(System.in);
        int sum =0;
        int sayac =0;

        do {
            System.out.println("Lütfen pozitif bir sayı giriniz.");
            int num= input.nextInt();
            if (num==0) {
                break;
            } else if (num<0) {
                System.out.println("Negatif sayı giremezsiniz.");

            }else {
                sum = sum+num;
                System.out.println("sum = " + sum);
                sayac++;
                System.out.println("sayac = " + sayac);
            }


        }while(true);


    }
}
