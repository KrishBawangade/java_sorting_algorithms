package cyclic_sort.imp_questions;

public class FindDuplicateNumber {

    static int findDuplicateNumber(int[] nums) {
        return duplicateNumber(nums);
    }

    static int duplicateNumber(int[] arr){
        int  i=0;

        // run the while loop-  while i<arr.length
        while(i<arr.length){
            int element = arr[i];

            // return duplicate if found return it
            if(element == arr[element-1] && element-1 != i){
                return element;
            }

            // check if element is at correct index, if yes increament i
            // and ignore element if its index is already occupied
            if(element-1 == i){
                i++;
            }else{
                // if element is not at it's correct index swap to it's correct index
                arr[i] = arr[element-1];
                arr[element-1] = element;
            }
           
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {3,3,3,3,3};
        int duplicateNum = findDuplicateNumber(arr);
        System.out.println("The duplicate no. is "+ duplicateNum);
    }
}
