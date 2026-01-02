import java.util.ArrayList;
import java.util.Collections;
public class Basic {

    //swap 2 numbers in array list function
    public static void swap(ArrayList<Integer> list,int idx1, int idx2){
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String args[]){
        ArrayList <Integer> list = new ArrayList<>();
        ArrayList <String> list2 = new ArrayList<>();
        ArrayList <Boolean> list3 = new ArrayList<>();
        //Add element - O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        list.add(1,0); //O(n) //us index pe nya element ajata h or list age khisak jati h
        System.out.println(list);
        //Get element - O(1)
        int element=list.get(2);
        System.out.println(element);

        //delete element - O(n)
        list.remove(2);
        System.out.println(list);

        //set element at an index - O(n)
        list.set(2,7);
        System.out.println(list);  //us index pe nya element ajata h or purana delete hojata h

        //contains element - O(n)
        System.out.println(list.contains(0));
        System.out.println(list.contains(9));

        //size of arraylist
        System.out.println("Size of list: "+ list.size());

        //print the elements of arraylist
        for(int i=0;i<list.size();i++){
           System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //print reverse arraylist - O(n)
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();

        //find maximum in arraylist
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            // if(max<list.get(i)){
            //     max=list.get(i);
            // }
            max=Math.max(max, list.get(i));
        }
        System.out.println("largest element: "+max);

        //swap two numbers
        int idx1=1;
        int idx2=2;
        swap(list,2,3);
        System.out.println("list after swaping indexes: "+ list);


        //sorting an arraylist
        Collections.sort(list); //in ascending order
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());  //in descending order
        //reverseOrder() is a comparator function
        System.out.println(list);
    }
}
