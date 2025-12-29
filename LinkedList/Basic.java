//Linked list 
public class Basic{
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){ //Time complexity-O(1)
        //step1-create new node
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        //step2-newNode next=head
        newNode.next=head; //link

        //step3-head=newNode
        head=newNode;
    }

    public void addLast(int data){  //Time complexity-O(1)
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void print(){  //Time complexity-O(n)
        if(head==null){ 
            System.out.println("The Linked list is empty");
            return;
        }
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void add(int index, int data){
        if(index==0){ //base case
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<index-1){
            temp=temp.next;
            i++;
        }
        //i=index-1; temp ->prev
        newNode.next=temp.next;
        temp.next=newNode;

    }

    public int removeFirst(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    public static int removeLast(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        //prev: i=size-2; bcz null i=size-1
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data; //tail.data
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }

    public int iterativeSearch(int key){  //Time complexity- O(n)
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){ //key found
                return i;
            }
            temp=temp.next;
            i++;
        }
        //key not found
        return -1;
    }

    public int helper(Node head, int key){ //actual recursive function Time complexity - O(n)
        if(head==null){
            return -1;
        }

        if(head.data==key){
            return 0;
        }
        int index=helper(head.next,key);
        if(index==-1){
            return -1;
        }
        return index+1;
    }
    public int recursiveSearch(int key){
        return helper(head,key);
    }

    public void reverse(){  //Time complexity - O(n)
        Node prev=null;
        Node curr=tail=head;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void main(String args[]){
        Basic ll=new Basic();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2,9);
        ll.print();
        ll.removeFirst();
        ll.removeLast();
        System.out.println("size"+ll.size);
        System.out.println("key found at index "+ll.iterativeSearch(3));
        System.out.println("key found at index "+ll.recursiveSearch(1));
        ll.reverse();
        ll.print();
    }
}