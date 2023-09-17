package practice06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class öylesiner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("1. ismi yazın");
        String name1=input.nextLine();
        System.out.println("2. ismi yazın");
        String name2= input.nextLine();
        int sum=0;

        if (name1.length()%2==0){
           sum = name1.length()/2;
            System.out.println(name1.substring(0, sum)+name2+name1.substring(sum));
        }else System.out.println("isim1, isim2 ye eklenemiyor.");



    }
}
