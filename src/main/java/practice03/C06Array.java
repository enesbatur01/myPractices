package practice03;

import java.util.Arrays;
import java.util.Scanner;

public class C06Array {
    public static void main(String[] args) {

          /*
        5 elemanlı bir array olusturunuz(int)
        Arrayin elemanlarını sıra ile kullanıcıdan alınız, arrayi yazdırınız
        Arrayın elemanlarının ortalamasını bulunuz, ortalamayı yazdırınız
        Ortalamadan daha buyuk olan array elemanlarını yazdırınız
        Arrayin elemanlarının işaretlerini degistiren bir kod yazzınız
         */

        //5 elemanlı bir array olusturunuz(int)

        int nums[] = new int[5];
        Scanner input = new Scanner(System.in);
        double sum = 0;
        double bölüm = 0;

        //Arrayin elemanlarını sıra ile kullanıcıdan alınız, arrayi yazdırınız

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Lütfen 5 eleman giriniz.");
            nums[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(nums));

        for (int w : nums) {
            sum = sum + w;
        }
        System.out.println("Ortalama " + (sum / nums.length));

        //Arrayın elemanlarının ortalamasını bulunuz, ortalamayı yazdırınız

        bölüm = sum / nums.length;

        // Ortalamadan daha buyuk olan array elemanlarını yazdırınız

        for (int w : nums) {
            if (w > bölüm) {
                System.out.print(w + " ");
            }
        }
        System.out.println();

        //Arrayin elemanlarının işaretlerini degistiren bir kod yazzınız


            for (int i = 0; i < nums.length; i++) {
                nums[i] = nums[i]*-1;


        }
        System.out.println(Arrays.toString(nums));
    }

}
