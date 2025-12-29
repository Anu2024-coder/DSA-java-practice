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
    public static void main(String args[]){
        Basic ll=new Basic();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2,9);
        ll.print();
        System.out.println(ll.size);
    }
}