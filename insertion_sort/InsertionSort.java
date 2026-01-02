package insertion_sort;

import java.util.Arrays;

public class InsertionSort {

    static void insertionSort(int[] arr){

        // run the loop from 1 to arr.length-1 iterations
        for(int i=1; i<=arr.length-1;i++){

            // run the loop for i till 0 in reverse
            for(int j=i; j>0;j--){

                // swap the element, if the jth element is smaller than j-1th element
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else{
                    break;
                }
            }

        }
    }

    public static void main(String[] args){
        int[] arr = {56, 45,34,23,1};

        System.out.println("Before Sorting - "+ Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("After Sorting - " + Arrays.toString(arr));
    }
}
