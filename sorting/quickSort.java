public class quickSort {
    public static void printArr(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void quickSortArray(int[] arr, int si, int ei){
        if(si>=ei){
            return;
        }
        //pivot is last element
        int pIdx=partition(arr,si,ei);
        quickSortArray(arr, si, pIdx-1); //left
        quickSortArray(arr, pIdx+1, ei); //right
    }

    public static int partition(int arr[],int si, int ei){
        int pivot=arr[ei];
        int i=si-1; // jgah bnana- to make place for elements smaller than pivot
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i]; //pivot=arr[i] nhi likhna
        arr[i]=temp;
        return i;
    }
    public static void main(String args[]){
        int arr[]={6,3,9,8,2,5,-9,0,};
        quickSortArray(arr,0,arr.length-1);
        printArr(arr);
    }
}

//worst case in quick sort-O(n^2)
//worst case occurs when pivot is always the smallest or the largest element or the array is already sorted