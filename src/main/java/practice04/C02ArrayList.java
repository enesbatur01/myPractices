package practice04;

import java.util.ArrayList;
import java.util.Arrays;

public class C02ArrayList {
    public static void main(String[] args) {

        // Verilen bir array'den tekrar eden elemanları silip
        // tekrarsız elemanlardan olusan bir array haline donusturun
        //  int arr[]={1,2,2,3,4,4,5};

        int arr[]={1,2,2,3,4,4,5};

        ArrayList<Integer> newArr = new ArrayList<>();
        System.out.println(Arrays.toString(arr));

        for (int w:arr){
            if (!newArr.contains(w)){
                newArr.add(w);
            }
        }
        System.out.println(newArr);
        int brr [] = new int[newArr.size()];
        for (int i = 0; i < newArr.size() ; i++) {

            brr [i] = newArr.get(i);

        }
        System.out.println(Arrays.toString(brr));

        arr = brr;

        System.out.println(Arrays.toString(arr));

    }
}
