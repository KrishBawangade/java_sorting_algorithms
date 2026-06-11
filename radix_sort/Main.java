package radix_sort;

import java.util.*;

public class Main {
    public static void main(String[] args){
        int[] arr = {29,83,471,86,5,19};

        RadixSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
