import java.util.*;
public class palindromeLinkedList {
    static class Node{
        int data;
        Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
    public static boolean isPalindrome(Node head){
        Stack<Integer> s=new Stack<>();
        Node temp=head;

        //push all elements to stack
        while(temp!=null){
            s.push(temp.data);
            temp=temp.next;
        }

        //compare stack with linked list
        temp=head;
        while(temp!=null){
            if(temp.data!=s.pop()){
                return false;
            }
            temp=temp.next;
        }
        return true;
    }
    public static void main(String args[]){
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(2);
        head.next.next.next=new Node(1);

        if(isPalindrome(head)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
