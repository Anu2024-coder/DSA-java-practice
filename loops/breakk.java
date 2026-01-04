package loops;
//keep entering number until user enters a multiple of 10
import java.util.*;
public class breakk {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        do{
            int n=sc.nextInt();
            System.out.println(n);
            if(n%10==0){
                break;
            }
        } while(true);
}
}

