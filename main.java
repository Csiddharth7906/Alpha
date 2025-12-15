// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class main {
    public static void main(String[] args) {
        int max=Integer.MIN_VALUE;
         int curr=0;
        int arr[]={1,-2,6,-1,3};
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=1;j<arr.length;j++){
                int end=j;
               
                for(int k=start;k<=end;k++){
                    curr+=arr[k];
            
                    
                }
                 if(curr>max){
                        max=curr;

                    }
               
            }
        }
        System.out.println(max);
    }
}