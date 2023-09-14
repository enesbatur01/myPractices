package practice06;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueArr {
    public static int[] benzersizYap(int arr[]) {

        Set<Integer> uniqueSet = new HashSet<>();

        for (int w :arr){
            uniqueSet.add(w);
        }

        System.out.println(uniqueSet);

        int [] arr2= new int[uniqueSet.size()];

        int idx =0;

        for (int w:uniqueSet){
            arr2[idx]=w;
            idx++;
        }
        System.out.println(Arrays.toString(arr2));
        return arr2;
    }
}
