// package functions;
// import java.util.*;
// public class basicFunction {
//     public static void sumFunction(){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int sum=a+b;
//         System.out.println(sum);
//     }
//     public static void main(String args[]){
//         sumFunction();
//     }
// }

// package functions;
// import java.util.*;

// public class BasicFunction {
//     public static int sumFunction(int a, int b) { //parameters or formal parameters
//         return a + b;
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first number: ");
//         int a = sc.nextInt();
//         System.out.print("Enter second number: ");
//         int b = sc.nextInt();

//         int sum = sumFunction(a, b);  //arguments or actual parameters
//         System.out.println("Sum = " + sum);

//         sc.close();
//     }
// }



//program to swap two numbers
//(java always calls by value)***
// import java.util.*; 
// public class Main{
//     public static void main(String args[]){
//     Scanner sc=new Scanner(System.in);
//     int a=5;
//     int b=10;
//     //swap
//     int temp=a;
//     a=b;
//     b=temp;
//     System.out.println("Value of a:"+a);
//     System.out.println("Value of b:"+b);
//     }
// }



//swap with function
//(if you try to print a and b value in main function then in output values will not be swapped because the changes are made 
//only in that swap function not in the main function so you have to print a and b in swap function)
// import java.util.*;
// public class Main{
//     public static void swap(int a,int b){
//         int temp=a;
//         a=b;
//         b=temp;
//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         swap(a,b);
//         System.out.println("value of a:"+a);
//         System.out.println("value of b:"+b);
//     }
// }


//find product of a and b using function 
// import java.util.*;
// public class Main{
//     public static int product(int a,int b){
//         int product=a*b;
//         return product;
//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int result=product(a,b);
//         System.out.println(result);
//     }
// }


//to calculate factorial of a number
// import java.util.*;
// public class Main{
//     public static int factorial(int num){
//         int fact=1;
//         for(int i=1;i<=num;i++){
//             fact*=i;
//         }
//         return fact;
//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
//        int result= factorial(num);
//        System.out.println(result);
//     }
// }

//to find the binomial coefficient
// import java.util.*;
// public class Main{
//     public static int factorial(int num){
//         int fact=1;
//         for(int i=1;i<=num;i++){
//             fact*=i;
//         }
//         return fact;
//     }

//     public static int binomialCoefficient(int n, int r){
//         int nFact=factorial(n);
//         int rFact=factorial(r);
//         int nMrFact=factorial(n-r);
//         int finalResult=(nFact)/(rFact*nMrFact);
//         return finalResult;
//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int r=sc.nextInt();
//         System.out.println(binomialCoefficient(n,r));
//     }
// }

//function overloading- multiple functions with the same name but different parameters
//function overloading doesn't depend on return type but on the parameters

//using parameters

// import java.util.*;
// class Main{
//     public static int add(int a,int b){
//         return a+b;
//     }
//     public static int add(int a,int b, int c){
//         return a+b+c;
//     }
//     public static void main(String args[]){
//         System.out.println(add(3,4));
//         System.out.println(add(3,4,5));
//     }
// }

//using data types
// import java.util.*;
// class Main{
//     public static int add(int a,int b){
//         return a+b;
//     }
//     public static float add(float a, float b){
//         return a+b;
//     }
//     public static void main(String args[]){
//         System.out.println(add(2,3));
//         System.out.println(add(3.4f,5.6f));
//     }
// }


//to check if a number is prime or not
// import java.util.*;
// class Main{
//     public static boolean isPrime(int n){
//         for(int i=2;i<n-1;i++){
//             if(n%2==0){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String args[]){
//         System.out.println(isPrime(5));
//     }
// }

//optimized solution to find prime number or not
// import java.util.*;
// class Main{
//     public static boolean isPrime(int n){
//         if(n==2){
//             return true;
//         }
//         for(int i=2;i<=Math.sqrt(n);i++){
//             if(n%i==0){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String args[]){
//         System.out.println(isPrime(4));
//     }
// }

//print prime numbers from 2 to n
// import java.util.*;
// class Main{
//     public static boolean isPrime(int n){
//         if(n==2){
//             return true;
//         }
//         for(int i=2;i<=Math.sqrt(n);i++){
//             if(n%i==0){
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void primeRange(int m){
//         for(int i=2;i<=m;i++){
//             if(isPrime(i)){
//                 System.out.println(i+ " ");
//             }
//         }
//         System.out.println();
//     }
//     public static void main(String args[]){
//         primeRange(10);
//     }
// }


//convert a number from binary to decimal
//convert a number from decimal to binary




//functions questions
//average of three numbers
// import java.util.*;
// class Main{
//     public static int avg(int a,int b,int c){
//         int avg=(a+b+c)/3;
//         return avg;
//     }
//     public static void main(String args[]){
//         System.out.println(avg(2,3,4));
//     }
// }


//write a method isEven that accepts int argument returns true even even else false. and also write a program to test your method
// import java.util.*;
// class Main{
//     public static boolean isEven(int num){
//         return num%2==0;
//     }
//     public static void main(String args[]){
//         System.out.println(isEven(5));
//     }
// }

//to check if a number is palindrome or not
// import java.util.*;
// class Main{
//     public static boolean isPalindrome(int num){
//         int n=num;
//         int reversed=0;
//         while(n!=0){
//             int lastDigit=n%10;
//             reversed=reversed*10+lastDigit;
//             n=n/10;
//         }
//         if(num==reversed){
//             return true;
//         }
//         return false;
//     }
//     public static void main(String args[]){
//         System.out.println(isPalindrome(565));
//     }
// }

//java method to compute the sum of digits in an integer
// import java.util.*;
// class Main{
//     public static int sum(int num){
//         int sum=0;
//         while(num>0){
//             int lastDigit=num%10;
//             sum+=lastDigit;
//             num=num/10;
//         }
//         return sum;
//     }
//     public static void main(String args[]){
//         System.out.println(sum(123));
//     }
// }