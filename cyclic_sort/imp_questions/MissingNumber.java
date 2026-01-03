package cyclic_sort.imp_questions;

public class MissingNumber {

    static int missingNumber(int[] nums) {
        cyclicSort(nums);
        return findMissingNum(nums);
    }

    static void cyclicSort(int[] arr){
        int  i=0;

        // run the while loop-  while i<arr.length
        while(i<arr.length){
            int element = arr[i];

            // check if element is at correct index, if yes increament i
            // and ignore element if its index is not available
            if(element == i || element == arr.length){
                i++;
            }else{
                // if element is not at it's correct index swap to it's correct index
                arr[i] = arr[element];
                arr[element] = element;
            }
           
        }
    }

    static int findMissingNum(int[] arr){
        
        for(int i=0;i<arr.length;i++){
            // if arr[i] !=i that means i is missing, return i
            if(arr[i] != i){
                return i;
            }
        }
        return arr.length;
    }

    public static void main(String[] args){
        int[] arr = {8,6,4,2,3,5,7,0,1};
        int missingNum = missingNumber(arr);
        System.out.println("The missing no. is "+ missingNum);
    }
}
