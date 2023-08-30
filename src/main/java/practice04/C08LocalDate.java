package practice04;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class C08LocalDate {
    public static void main(String[] args) {

          /*
        Ali 29.10.1923 tarihinden 45 yıl 8 ay 5 gun sonra dogdu.
        Veli  15.09.1993 tarihinden 24 yil 2 ay 11 gun once dogdu.
        Ali ve Veli'nin dogum tarihini hesaplayıp yazdırınız.
        Ali ve Veli'nin dogum tarihlerinin aynı olup olmadıgını kontrol eden kodu yazınız
         */
        LocalDate ali = LocalDate.of(1923,10,29).plusYears(45).plusMonths(8).plusDays(5);
        LocalDate veli = LocalDate.of(1993,9,15).minusYears(24).minusMonths(2).minusDays(11);

        System.out.println(ali);
        System.out.println(veli);

        //Formatlama
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy/M/d");
        System.out.println(dtf.format(ali));

        //eşitmi tarihler bak

        if (ali.isEqual(veli)){
            System.out.println("Aynı tarihte doğmuşlardır");
        } else System.out.println("Farklı tarihlerde doğmuşlardır");




    }
}
