public class MaxSubarray {
    public static void main(String[] args) {
        int arr[]={-1,-2,-4,};
        int MaxSubarray=Integer.MIN_VALUE;
        int cs=0;
        if (MaxSubarray==0) {
            System.out.println("Maximun subarray  : "+ "-1 ");
        }
       
        for (int i = 0; i < arr.length; i++) {
            cs+=arr[i];
            if (cs<0) {
                cs=0;
            }
            MaxSubarray=Math.max(cs, MaxSubarray);
        }
        System.out.println("Maximun subarray  : "+MaxSubarray);
    }
}
