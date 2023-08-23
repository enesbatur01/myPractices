package practice03;

import java.util.Scanner;

public class C03ForLoop {

    public static void main(String[] args) {

        /*
            Kullanıcıdan sisteme satır sayısını girmesini isteyiniz.
            ve ardından yıldız işaretini kullanarak bir dik üçgen çizin

            Satır sayısı = 4 ==>      *
                                      * *
                                      * * *
                                      * * * *
            */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen satır sayısı giriniz. ");
        int num = input.nextInt();
        int sum = 0;

        for (int i = 0; i < num; i++) { // satır döngüsü için

            for (int j = 0; j <= i; j++) { //* yazdırma işlemi için(sütun için)
                System.out.print("* ");
            }
            System.out.println();

        }

    }
}
