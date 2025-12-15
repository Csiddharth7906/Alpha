public class Pairs {
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        int MaxSubarray=Integer.MIN_VALUE;
        int prefix []=new int[arr.length];
        prefix[0]=arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i]=prefix[i-1]+arr[i];
        }

     
        for (int i = 0; i < arr.length; i++) {
           
            for (int j = i; j < arr.length; j++) {
                int CurrSub = 0;
                // for (int k =i; k <=j; k++) {
                    
                //     CurrSub+=arr[k];
                  
                // }
                // System.out.println(CurrSub);
                CurrSub=i==0? prefix[j]:prefix[j]-prefix[i-1];
                if(MaxSubarray<CurrSub){
                    MaxSubarray=CurrSub;
                }
               
            }
            
        }

        System.out.println("Max Sum = "+MaxSubarray+" ");
    }
}
