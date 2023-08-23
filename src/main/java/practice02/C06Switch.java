package practice02;

import java.util.Scanner;

public class C06Switch {

    public static void main(String[] args) {

        /*
       Kullanıcıdan yıl ve ay numarasını ayrı ayrı sisteme girmesini isteyiniz.
       Girilen ay numarasına göre ayin kaç gün çektigini yazdırınız.


       NOT: 1, 3, 5, 7, 8, 10, 12. aylar 31 gun çeker
            4, 6, 9, 11. aylar 30 gun çeker
            2. ay 4 yılda bir 29 gun ceker, diger yıllarda 28 gun ceker
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter year and month..");
        int year = input.nextInt();
        byte month= input.nextByte();

        switch (month) {
            case (1) :
                System.out.println("31 gün çeker...");
                break;
            case (2) :
                System.out.println(year%4 == 0 ? "Girdiğiniz ay 29 çekiyor":"Girdiğiniz ay 28 gün çeker");
                break;
            case (3) :
                System.out.println("31 gün çeker...");
                break;
            case (4) :
                System.out.println("30 gün çeker...");
                break;
            case (5) :
                System.out.println("31 gün çeker...");
                break;
            case (6) :
                System.out.println("30 gün çeker...");
                break;
            case (7) :
                System.out.println("31 gün çeker...");
                break;
            case (8) :
                System.out.println("31 gün çeker...");
                break;
            case (9) :
                System.out.println("30 gün çeker...");
                break;
            case (10) :
                System.out.println("31 gün çeker...");
                break;
            case (11) :
                System.out.println("30 gün çeker...");
                break;
            case (12) :
                System.out.println("31 gün çeker...");
                break;
            default:
                System.out.println("Please enter a valid month..");
        }


    }

}
