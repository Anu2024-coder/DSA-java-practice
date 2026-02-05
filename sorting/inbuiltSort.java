import java.util.Arrays;
import java.util.Collections;
public class inbuiltSort {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={1,3,57,90,4,4};
        Integer arr1[]={3,574,2466,13,3,53,5};
        Arrays.sort(arr,0,5);
        Arrays.sort(arr1,0,5,Collections.reverseOrder());
        printArr(arr);
    }
}
