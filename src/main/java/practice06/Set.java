package practice06;

import java.util.Arrays;

public class Set extends UniqueArr{
    public static void main(String[] args)  {

        // Verilen bir array'den tekrar eden elemanları silip
        // unique elemanlardan olusan bir array haline donusturen method olusturun
        // int arr[]={1,2,2,3,4,4,5};

        int arr[]={1,2,2,3,4,4,5,2,0,6,4};

        arr=benzersizYap(arr);
        System.out.println("Son hali"+ Arrays.toString(arr));


    }
}
