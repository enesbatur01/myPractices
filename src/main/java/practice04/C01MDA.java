package practice04;

import java.util.Arrays;
import java.util.Scanner;

public class C01MDA {
    public static void main(String[] args) {
        /*
        arr[3][2] luk bir mdarray olusturun
        Arrayın elemanlarını kullanıcıdan alın
        daha sonra bu mda 'yi, her bir elemanı iç array elemanlarının toplamına esıt olan tek boyutlu
        bir array haline getirin
        ör-->int [][] arr={{3,4},{1,2},{8,7}} ----> {7,3,15}
         */
        int [][] arr= new int[3][2];

        Scanner input = new Scanner(System.in);
        System.out.println(Arrays.deepToString(arr));


        for (int i =0; i < arr.length;i++){//outter array için

            for (int j=0;j < arr[i].length;j++){//inner array için
                System.out.println("Please enter numbers to sum");
                arr[i][j] =input.nextInt();
            }

        }
        System.out.println(Arrays.deepToString(arr));

       int [] newArr = new int[arr.length];



        for (int i = 0; i < arr.length ; i++) { //outer array için
            int sum =0;
            for (int j = 0; j < arr[i].length ; j++) {//inner array için

                sum += arr[i][j];
            }
            newArr[i]=sum;

        }
        System.out.println(Arrays.toString(newArr));

       }



    }

