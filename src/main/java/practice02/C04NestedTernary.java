package practice02;

import java.util.Scanner;

public class C04NestedTernary {

    public static void main(String[] args) {

         /*
        Kullanıcıdan ayri ayri iki tamsayı sisteme girmesini isteyin.
        Ternary kullanarak;
        Sayılar bir birine esit ise konsolda "Sayılar Birbirine Esit" yazdırın
        Sayılar birbirine esit degilse, buyuk olan sayısı ekrana yazdırın.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 2 any number..");

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        String result = num1 == num2 ? "two numbers are equal to each other" : num1 > num2 ? num1+ " is bigger than "+num2:num2+" is bigger than "+num1;
        System.out.println("result = " + result);

    }

}
