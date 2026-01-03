package cyclic_sort;

import java.util.Arrays;


public class CyclicSort{

    static void cyclicSort(int[] arr){
        int  i=0;

        // run the while loop-  while i<arr.length-1
        while(i<arr.length-1){
            int element = arr[i];

            // check if element is at correct index, if yes increament i
            if(element-1 == i){
                i++;
            }else{
                // if element is not at it's correct index swap to it's correct index
                arr[i] = arr[element-1];
                arr[element-1] = element;
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {3,5,2,1,4};

        System.out.println("Before Sorting - "+ Arrays.toString(arr));
        cyclicSort(arr);
        System.out.println("After Sorting - " + Arrays.toString(arr));
    }
}