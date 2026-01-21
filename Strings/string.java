import java.util.*;
public class string{
    public static void printLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+ " ");
        }
        System.out.println();
    }

    public static String substring(String str, int si, int ei){
        String substring="";
        for(int i=si; i<ei;i++){
            substring+=str.charAt(i);
        }
        return substring;
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

        //compare
        String s1="Anu";
        String s2="Anu";
        String s3=new String("Anu");

        if(s1==s2){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        if(s1==s3){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        if(s1.equals(s3)){
            System.out.println("Strings are equal");
        }

        //substring
        String strrr="Anu gill";
        System.out.println(substring(strrr,0,5));

        //built in substring function
        System.out.println(strrr.substring(0,5));
        sc.close();
    }
}