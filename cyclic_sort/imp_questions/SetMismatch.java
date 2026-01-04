package cyclic_sort.imp_questions;

import java.util.Arrays;

public class SetMismatch {

    static int[] findErrorNums(int[] nums) {
        cyclicSort(nums);
        return errorNums(nums);
    }

    static void cyclicSort(int[] arr){
        int  i=0;

        // run the while loop- while i<arr.length
        while(i<arr.length){
            int element = arr[i];

            // check if element is at correct index, if yes increament i
            // and ignore element index is already occupied
            if(element-1 == i || element == arr[element-1]){
                i++;
            }else{
                // if element is not at it's correct index swap to it's correct index
                arr[i] = arr[element-1];
                arr[element-1] = element;
            }
           
        }
    }

    static int[] errorNums(int[] arr){

        int[] errorNums = new int[2];
        
        for(int i=0;i<arr.length;i++){
            int element = arr[i];

            // if element-1 != i and element == arr[element-1], then duplicate found,
            // add the duplicate and missing number and return errorNums
            if(element-1 != i && element == arr[element-1]){
                errorNums[0] = element;
                errorNums[1] = i+1;

                return errorNums;
            }
        }
        return errorNums;
    }

    public static void main(String[] args){
        int[] arr = {1,2,2,4};
        int[] errorNums = findErrorNums(arr);
        System.out.println("Error Numbers = "+ Arrays.toString(errorNums));
    }
}
