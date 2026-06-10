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

    public static void sortHashMap(int[] arr){
        if(arr.length == 0){
            return;
        }

        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();

        Map<Integer, Integer> freqMap = new HashMap<>();

        for(int num: arr){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int k=0;

        // updating the original array in sorted form
        for(int i=min; i<=max; i++){
            if(k>=arr.length){
                break;
            }
            while(freqMap.getOrDefault(i, 0) != 0){
                arr[k] = i;
                k++;
                freqMap.put(i, freqMap.getOrDefault(i, 0) - 1);
            }
        }
    }
}