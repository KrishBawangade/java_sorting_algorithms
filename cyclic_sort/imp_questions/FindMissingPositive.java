package cyclic_sort.imp_questions;

public class FindMissingPositive {

    static int findMissingPositive(int[] nums) {
        cyclicSort(nums);
        return missingPositive(nums);
    }

    static void cyclicSort(int[] arr){
        int  i=0;

        // run the while loop-  while i<arr.length
        while(i<arr.length){
            int element = arr[i];

            if(element-1 != i && element <= arr.length && element>0 && element == arr[element-1]){
                i++;
            }else if(element-1 == i || element > arr.length || element<=0){
                // check if element is at correct index, if yes increament i
                // and ignore element if its index is not available by increamenting i
                i++;
            }else{
                // if element is not at it's correct index swap to it's correct index
                arr[i] = arr[element-1];
                arr[element-1] = element;
            }
           
        }
    }

    static int missingPositive(int[] arr){
        
        for(int i=0;i<arr.length;i++){
            // if arr[i]-1 !=i that means i+1 is the minimum missing positive, return it
            if(arr[i]-1 != i){
                return i+1;
            }
        }
        // if all the elements are in correct index then return arr.length+1(minimum missing positive)
        return arr.length+1; 
    }

    public static void main(String[] args){
        int[] arr = {1,1};
        int missingPositive = findMissingPositive(arr);
        System.out.println("The missing positive no. is "+ missingPositive);
    }
}

