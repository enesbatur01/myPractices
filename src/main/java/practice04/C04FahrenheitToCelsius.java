package practice04;

import java.util.Scanner;

public class C04FahrenheitToCelsius {

    public static void main(String[] args) {

        // Fahrenheit değeri, Celsius değere çeviren method yazınız.
        // formül: c = (f-32)/1.8

        //Not: fahrenheit degerini bu methoda gonderdıgımde bana celsius cinsinden sıcaklık donmeli

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter fahrenheit degree");

        double fahrenheit = input.nextDouble();

        double celsius = celsius(fahrenheit);

        System.out.println(celsius);


    }

    public static double celsius (double fahrenheit){
         double celsius = (fahrenheit-32)/1.8;
         return celsius;
    }

}
