package practice02;

import java.util.Scanner;

public class C07StringManipulations {

    public static void main(String[] args) {


         /*
    Kullanıcıdan ad ve soyadını aralarında bir bosluk olacak sekılde sisteme girmesini isteyiniz
    NOT: Yalnızca bir ad bir soyad girilmeli
    Ad ve Soyadı ilk harfleri buyuk olacak sekılde alt alta yazdırın
    Ad : Canan
    Soyad : Can
     */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen ad ve soyadınızı aralarında bir boşluk olacak şekilde girin "
                + "\n Not: Yalnızca bir ad ve bir soyad girilmeli");
        String name= input.nextLine();
        int spaceValue = name.indexOf(" ");
        String newName=name.toUpperCase().charAt(0)+name.toLowerCase().substring(1)+name.toUpperCase().charAt(spaceValue+1);
        System.out.println("Ad : "+newName.substring(0,spaceValue));
        System.out.println("Soyad : "+newName.substring(spaceValue+1));





    }

}
