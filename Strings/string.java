import java.util.*;
public class string{
    public static void printLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+ " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str="abcd";
        String str1=new String("abcde");
        String name;
        name=sc.nextLine();
        System.out.println(str);
        System.out.println(str1);
        System.out.println(name);

        System.out.println(name.length()); //length of string

        String full=str+" "+str1; //concatenation using + operator
        System.out.println(full); 
        System.out.println(name.charAt(0));//charAt method
        printLetters(name);
        sc.close();
    }
}