package practice03;

import java.util.Scanner;

public class C01ForLoop {

    public static void main(String[] args) {

         /*
            Kullanıcıdan bir kelime sisteme girmesini isteyiniz.
            kelimede ilk c harfi rastlanılana kadar a harflerinin sayısını yazdırınız.
           */


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter any words");
        String wrd = input.nextLine();
        int totalA =0;
        for (int i = 0; i < wrd.length(); i++) {
            wrd.charAt(i);
            if (wrd.charAt(i)=='c'||wrd.charAt(i)=='C') {
                break;

            } else if (wrd.charAt(i)=='a'||wrd.charAt(i)=='A') {

               totalA++;
            }else {
                continue;
            }

        }
        System.out.println(totalA);
    }

}
