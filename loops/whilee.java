package loops;
import java.util.*;
public class whilee {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int i=1;
        int sum=0;
        
        while(i<=n){
            sum+=i;
            i++;
        }
        System.out.print("sum is: "+sum);

    }
}
