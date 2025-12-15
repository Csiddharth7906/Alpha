public class Basic{
    public static int reverse(int n){
      
        int rev=0;
        while(n>0){
        int rem=n%10;
        rev=rem+rev*10;
        n=n/10;
        }
        return rev;
    }
    public static boolean palindrome(int n){
        int nums=n;
         int rev=0;
        while(n>0){
        int rem=n%10;
        rev=rem+rev*10;
        n=n/10;
        }
        if(rev == nums){
            return true;
        }else{
            return false;
        }
        
    }
    public static boolean checkPrime(int n){
        for(int i=2;i<n;i++){
            if((n%i)==0){
                return false;
            }
        }
        return true;
    }
    public static int fact(int n){
        int factn=1;
        
        for(int i=1;i<=n;i++){
            factn=factn*i;
        }
        return factn;
    }
    public static int recFact(int n){
        if(n==0){
            return 1;
        }
       int factn=recFact(n-1);
       return n*factn;
    }
    public static void revString(String str){
        for(int i=str.length();i>0;i--){
            System.out.print(str.charAt(i));
        }
    }
    public static void fibnaccii(int n ) {
        int first=0;
        int sec=1;
        for(int i=0;i<=n;i++){
           if(i==0){
            System.out.print(first);
           }
          else if(i==1){
            System.out.print(sec);
           }
           else{
            int next=first+sec;
            first=sec;
            sec=next;
            System.out.print(next);
           }
        }
    }
    public static void main(String args[]){
       System.out.println(recFact(5));
       revString("my name is siddharth");
    }
}