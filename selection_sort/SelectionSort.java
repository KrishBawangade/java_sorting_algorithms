package selection_sort;

import java.util.Arrays;

public class SelectionSort {

    static void selectionSort(int[] arr){

        // run the loop for arr.length-1 iterations
        for(int i=0; i<arr.length-1;i++){

            // assume max as 1st element
            int max = arr[0];  
            int maxIndex = 0;

            // run the loop for 1 to arr.length-1-i iterations
            for(int j=1; j<=arr.length-1-i;j++){
                if(arr[j]>max){
                    max = arr[j];
                    maxIndex = j;
                }
            }

            // swap max element in it's correct position
            int pos = arr.length-1-i;
            arr[maxIndex] = arr[pos];
            arr[pos] = max;
        }
    }

    public static void main(String[] args){
        int[] arr = {32,23,-13,5,2};

        System.out.println("Before Sorting - "+ Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("After Sorting - " + Arrays.toString(arr));
    }
}
