public class EvenOdd{
    public static int GetBit(int n,int i){
        int bitmask= 1<<i;
        if((n & bitmask)==0){
            return 0;
        }else{
            return 1;
        }
    }
    public static int SetBit(int n,int i){
        int bitmask=1<<i;
        return n|bitmask;
    }
    public static int ClearBit(int n,int i){
        int bitmask=~(1<<i);
        return n&bitmask;
    }
    public static int UpdateBit(int n,int i,int newBit){
        n=ClearBit(n,i); 
        int bitmask=newBit<<i;
        return n|bitmask;
    }
    public static int ClearIthLastBit(int n,int i){
        int bitmask=(~0<<i);
        return n & bitmask;
    }
    public static void main(String[] args) {
       System.out.println(GetBit(5, 2)); 
        System.out.println(SetBit(7,2));
        System.out.println(ClearBit(10, 1));
        System.out.println(UpdateBit(10,2,1));
        System.out.println(ClearIthLastBit(15, 2));
    }
}