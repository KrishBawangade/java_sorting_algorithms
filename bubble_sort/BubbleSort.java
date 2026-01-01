import java.util.Arrays;

public class BubbleSort{

    static void bubbleSort(int[] arr){
        // run the loop for arr.length-1 iterations
        for(int i=0; i<arr.length-1;i++){
            // run the loop for arr.length-1-i iterations
            for(int j=0; j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    // swap arr[j] and arr[j+1] if arr[j] > arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {23,1,4,32,6};

        System.out.println("Before Sorting - "+ Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("After Sorting - " + Arrays.toString(arr));
    }
}