public class evenOdd {
    public static void checkEvenOdd(int n){
        int bitmask=1;
        if((n & bitmask) == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
    public static void main(String args[]){
        checkEvenOdd(3);
        checkEvenOdd(14);
    }
}
