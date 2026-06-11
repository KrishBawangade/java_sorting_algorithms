package radix_sort;

import java.util.*;

public class RadixSort {
    public static void sort(int[] arr){
        int largest =arr[0];
        int largestDigits =0 ;

        //find largest number
        for(int i=1; i<arr.length; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }

        // finding largestDigits 
        while(largest!=0){
            largestDigits++;
            largest = largest/10;
        }
        
        for(int i =0; i<largestDigits; i++){
            int[] output = new int[arr.length];
            // Frequency Array for 0-9 digits
            int[] freqArr = new int[10];
            int dividingFactor = (int) (Math.pow(10, i));

            for(int num: arr){
                num = num/dividingFactor;
                int digit = num%10;
                freqArr[digit]++;
            }

            // cumulative frequency
            for(int j=1; j<10; j++){
                freqArr[j] += freqArr[j-1]; 
            }

            // creating the output array
            for(int j=arr.length-1; j>=0; j--){
                int digit = (arr[j]/dividingFactor)%10;
                output[freqArr[digit]-1] = arr[j];
                freqArr[digit]--;
            }

            // copy the output array to the passed array
            System.arraycopy(output, 0, arr, 0, arr.length);
        }
    }
}
