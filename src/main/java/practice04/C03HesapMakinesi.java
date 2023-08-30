package practice04;

import java.util.Scanner;

public class C03HesapMakinesi {
    public static void main(String[] args) {

          /*
        Basit 4 islem yapan bir hesap makinesi kodlayınız
        Kullanıcıcn yapacagi islemi islem sembolu ile( +  -  /  *  ) secmesini isteyiniz
        Kullanıcının 2 sayi girmesini isteyiniz
        Girilen islem ve sayilara gore dogru sonucu ekrana yazdırınız
        */
        Scanner input = new Scanner(System.in);
        System.out.println("please choose your process : ( + , - , / , *  )");
        char process = input.next().charAt(0);

        if (process=='+' || process=='-' || process=='/' || process=='*' ){
            System.out.println("Please enter your process number \nfirst number");
            double num1 = input.nextDouble();
            System.out.println("Second number");
            double num2 = input.nextDouble();

            hesapMakinesi(process,num1,num2);



        }else {
            System.out.println("Invalid process");
        }


    }
    public static void hesapMakinesi (char process, double num1 , double num2){
        switch (process){
            case '+':
                System.out.println("Result : " +(num1+num2)); break;
            case '-':
                System.out.println("Result : " +(num1-num2)); break;
            case '*':
                System.out.println("Result : " +(num1*num2)); break;
            case '/':
                System.out.println("Result : " +(num1/num2)); break;


        }

    }
}
