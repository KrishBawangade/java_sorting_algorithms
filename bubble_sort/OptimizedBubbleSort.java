import java.util.Arrays;

public class OptimizedBubbleSort{

    static int bubbleSort(int[] arr){
        
        // comparison count
        int count = 0;

        // run the loop for arr.length-1 iterations
        for(int i=0; i<arr.length-1;i++){

            // swap flag for checking is swapped or not
            boolean isSwapped = false;

            // run the loop for arr.length-1-i iterations
            for(int j=0; j<arr.length-1-i;j++){
                count++;
                if(arr[j]>arr[j+1]){
                    // swap arr[j] and arr[j+1] if arr[j] > arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped = true;
                }
            }

            // if not swapped that means array is already sorted -> return count
            if(!isSwapped){
                return count;
            }
            
        }
        return count;
    }

    public static void main(String[] args){
        int[] arr = {1,67,34,23,89};

        System.out.println("Before Sorting - "+ Arrays.toString(arr));
        int count = bubbleSort(arr);
        System.out.println("After Sorting - " + Arrays.toString(arr));
        System.out.println("Total Comparisons - "+count);
    }
}