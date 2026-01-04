package cyclic_sort.imp_questions;

import java.util.List;
import java.util.ArrayList;

public class FindAllDuplicateNumbers {

    static List<Integer> findAllDuplicateNumbers(int[] nums) {
        cyclicSort(nums);
        return duplicateNumbers(nums);
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

    static List<Integer> duplicateNumbers(int[] arr){

        List<Integer> list = new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            int element = arr[i];

            // if element-1 != i and element == arr[element-1], then duplicate found, add it
            if(element-1 != i && element == arr[element-1]){
                list.add(element);
            }
        }
        return list;
    }

    public static void main(String[] args){
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> duplicates = findAllDuplicateNumbers(arr);
        System.out.println("All Duplicates are "+ duplicates);
    }
}
