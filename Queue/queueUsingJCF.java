//Queue is an interface not a class, we can't create objects of interfaces  that's why we use linkedList or ArrayDeque class to implement queue
import java.util.*;
public class queueUsingJCF {
    public static void main(String args[]){
        Queue<Integer> q= new LinkedList<>();
       //Queue<Integer>q=new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
