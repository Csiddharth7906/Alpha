public class PrintSubarray {
    public static void Subarray(int arr[]){
        int MaxSum=Integer.MIN_VALUE;
        int CurrSum=0;
        for (int i = 0; i < arr.length; i++) {
            int start=i;
            for (int j = i; j < arr.length; j++) {
                int end=j;
                for (int k = start; k <= end; k++) {
                    CurrSum+=arr[k];
                }
                System.out.println(CurrSum);
                if(CurrSum>MaxSum){
                    MaxSum=CurrSum;
                }
            }
            System.out.println("max sum ="+MaxSum);
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        Subarray(arr);
        


        
    }
}
