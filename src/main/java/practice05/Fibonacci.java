package practice05;

import java.util.Scanner;

public class Fibonacci {  /*
        Kulanıcıdan alınan bir tam sayı kadar eleman içeren (47den kucuk olmak kosuluyla)
        FIBONACCI dizisi olusturun(Bunu bir method olusturarak yazınız)
        Ör: sayi=10 için
        0-1-1-2-3-5-8-13-21-34 gibi
         */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number short than 47");
        int num= input.nextInt();

        FiboMethod.fibonacci(num);


    }
}
