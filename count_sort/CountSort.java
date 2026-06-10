package count_sort;

import java.util.*;

public class CountSort{

    public static void sort(int[] arr){
        if(arr.length == 0){
            return;
        }

        int largest = arr[0];
        
        // finding largest element
        for(int i=1; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        
        int[] freqArr = new int[largest+1];

        // creating an frequency array
        for(int i=0; i<arr.length; i++){
            freqArr[arr[i]]++;
        }

        int i=0;
        int j=0;

        // updating the original array to make it sorted
        while(i<arr.length){
            if(freqArr[j] > 0){
                while(freqArr[j] !=0){
                    arr[i] = j;
                    i++;
                    freqArr[j]--;
                }
            }
            j++;
        }
    }
}