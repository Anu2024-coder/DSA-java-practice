package loops;
import java.util.*;
public class forr {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("hello world");
        }
    }
}

//Write a program that reads a set of integers,and then prints the sum of the even and odd integers.
// import java.util.*;
// class solution{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the number of integers you want to sum:");
//         int n=sc.nextInt();
//         int evenSum=0;int oddSum=0;
//         System.out.println("Enter " + n + " integers:");
//         for(int i=0;i<n;i++){
//             int num=sc.nextInt();
//             if(num%2!=0){
//                 oddSum+=num;
//             }else{
//                 evenSum+=num;
//             }
//         }
//         System.out.println("Sum of even integrs="+ evenSum);
//         System.out.println("Sum of odd integrs="+ oddSum);
//     }
// }


//Write a program to find the factorial of a number entered by the user
// import java.util.*;
// class factorial{
//         public static void main(String argss[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the number to find factorial: ");
//         int n=sc.nextInt();
//         long fact=1;
//         for(int i=1;i<=n;i++){
//             fact*=i;
//         }
//         System.out.println("factorial of "+ n+ " is: "+fact);
//     }
// }

//write a program that prints the multiplication table of a number entered by the user
// import java.util.*;
// class multiplicationTable{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//             System.out.println("Enter the number: ");
//             int n=sc.nextInt();
//             System.out.println("multiplication table of "+n);
//             for(int i=1;i<=10;i++){
//                 System.out.println(n+"*"+i+"="+n*i);
//             }
//     }
// }