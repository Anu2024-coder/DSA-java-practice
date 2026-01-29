public class evenOdd {
    public static void checkEvenOdd(int n){
        int bitmask=1;
        if((n & bitmask) == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }

    public static int getIthBit(int n, int i){
        int bitmask=1<<i;
        if((n & bitmask)==0){
            return 0;
        }else{
            return 1;
        }
    }

    public static int setIthBit(int n, int i){
        int bitmask=1<<i;
        return n | bitmask;
    }

    public static int clearIthBit(int n, int i){
        int bitmask=~(1<<i);
        return n&bitmask;
    }
    public static void main(String args[]){
        checkEvenOdd(3);
        checkEvenOdd(14);
        System.out.println(getIthBit(10,2));
        System.out.println(setIthBit(10,2));
        System.out.println(clearIthBit(10,1));
    }
}
