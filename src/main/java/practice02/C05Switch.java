package practice02;

import java.util.Scanner;

public class C05Switch {

    public static void main(String[] args) {

         /*

         Kullanıcıdan 0-4 arasi sınav puanını sisteme girmesini isteyiniz.

         Eger puanı 0,0-1,0 arasında ise KALDI seviyesi veriniz
              puanı 1,0-2,0 arasında ise GECTI seviyesi veriniz
              puanı 2,0-2,5 arasında ise IYI seviyesi veriniz
              puanı 2,5-3,5 arasında ise UST seviyesi veriniz
              puanı 3,5-4,0 arasında ise HARİKA seviyesi veriniz

        switch case kullanarak KALDI seviyesine F harf notu veriniz
                               GECTİ seviyesine D harf notu veriniz
                               IYI seviyesine C harf notu veriniz
                               UST seviyesine B harf notu veriniz
                               HARİKA seviyesine A harf notu veriniz
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your exam result..");

        double grade= input.nextDouble();
        String level="" ;

        if (grade >=0 && grade <1) {
            level="Kaldı";

        } else if (grade >=1 &&grade <2) {
            level ="Geçti";

        }
        else if (grade >=2 &&grade <2.5) {
            level ="İyi";

        }
        else if (grade >=2.5 &&grade <3.5) {
            level ="Üst";

        }
        else if (grade >=3.5 &&grade <=4) {
            level ="Harika";

        }else {
            System.out.println("Please enter a valid note..");
        }

        System.out.println(level);

        switch (level.toLowerCase()) {

            case "kaldı" :
                System.out.println("F");
                break;
            case "geçti" :
                System.out.println("D");
                break;
            case "iyi" :
                System.out.println("C");
                break;
            case "üst" :
                System.out.println("B");
                break;
            case "harika" :
                System.out.println("A");
                break;
            default: System.out.println("lütfen geçerli bir puan giriniz.");

        }

    }

}
