package practice02;

import java.util.Scanner;

public class C01IfStatements {

    public static void main(String[] args) {

        //kullanıcıdan iki sayı isteyin
        //sayıların ikisi de pozitifse sayıların toplamını yazdırın
        //ikisi de negatifse sayıların çarpımını yazdırın
        //ikisi farklı işaretlere sahipse farklı işaretlerde sayılarla işlem yapamazsın
        //sayılardan sıfıra eşit olan varsa sıfır çarpmaya göre yutan elamandır yazdırın

        Scanner input = new Scanner(System.in);

        System.out.println("lütfen iki sayı giriniz..");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        if (num1 >0 && num2 >0) {
            System.out.println(num1+num2);
        } else if (num1 <0 && num2<0) {
            System.out.println(num1*num2);

        } else if (num1 ==0 || num2 ==0 ) {
            System.out.println("sıfır çarpmaya göre yutan elemandır.");

        }else {
            System.out.println("farklı işaretlerdeki sayılarla işlem yapamazsın");
        }

    }

}
