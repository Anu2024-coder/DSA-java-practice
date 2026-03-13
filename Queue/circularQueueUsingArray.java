// In a Circular Queue using Array, we use two pointers:
// front → points to the first element
// rear → points to the last inserted element
// Instead of shifting elements (like your previous queue), we reuse empty spaces using modulo %.
// This makes add and remove both O(1).
//Array se queue hum nhi bnate hain kyunki fixed size hota h array ka and usme remove krne ki time complexity O(1) ki bjaye O(n) hoti h
//But we make circular queue with array
public class circularQueueUsingArray {

    static class queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;

        queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
            front=-1;
        }

        public static boolean isEmpty(){
            return rear==-1 && front==-1;
        }

        //full
        public static boolean isFull(){
            return (rear+1)%size==front;
        }

        //add 
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            //add 1st element
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }

        //remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            int result=arr[front];

            //last element delete
            if(rear==front){
                rear=front=-1;
            }else{
                front=(front+1)%size;
            }
            return result;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }

            return arr[front];
        }
    }
    public static void main(String args[]){
        queue q=new queue(3);
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
