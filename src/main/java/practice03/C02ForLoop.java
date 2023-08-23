package practice03;

import java.util.Scanner;

public class C02ForLoop {

    public static void main(String[] args) {

         /*
         Kullanıcıdan sisteme 5 adet sayi girmesini isteyiniz
         Bu sayılardan birler basamagı 7 veya 9 olanlar hariç diğerlerinin toplamını bulunuz
        */

        Scanner input = new Scanner(System.in);
        int sum = 0;

        for (int i =0; i<5; i++){ //loop 5 kez dönecek
            System.out.println("Please enter numbers");
            int num = input.nextInt();
            if (num%10==7 || num%10==9){ //şart doğru ise bu elemanalrı pass geçmek istiyorum
                continue;
            }
            sum = sum+num;
        }
        System.out.println(sum);

    }
}
