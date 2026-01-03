package cyclic_sort.imp_questions;

import java.util.List;
import java.util.ArrayList;

public class FindDisappearedNumbers {
    static List<Integer> findDisappearedNumbers(int[] nums) {
        cyclicSort(nums);
        return disappearedNumbers(nums);
    }

    static void cyclicSort(int[] arr){
        int  i=0;

        // run the while loop- while i<arr.length
        while(i<arr.length){
            int element = arr[i];

            // check if element is at correct index, if yes increament i
            // and ignore element if its index is not available or index is already occupied
            if(element-1 == i || element >arr.length || element == arr[element-1]){
                i++;
            }else{
                // if element is not at it's correct index swap to it's correct index
                arr[i] = arr[element-1];
                arr[element-1] = element;
            }
           
        }
    }

    static List<Integer> disappearedNumbers(int[] arr){

        List<Integer> list = new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            // if arr[i]-1 != i that means i is missing, add i+1 to list
            if(arr[i]-1 != i){
                list.add(i+1);
            }
        }
        return list;
    }

    public static void main(String[] args){
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> disappearedNumbers = findDisappearedNumbers(arr);
        System.out.println("The disappeared numbers are "+ disappearedNumbers);
    }
}
