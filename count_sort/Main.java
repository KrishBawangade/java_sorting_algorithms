package count_sort;

public class Main {
    public static void main(String[] args){
        int[] arr = {1,3,2,5,4,3,8};

        CountSort.sortHashMap(arr);

        for(int num: arr){
            System.out.print(num+" ");
        }
    }
}
