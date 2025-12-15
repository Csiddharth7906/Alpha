public class Demo{
    public static int Findelement(int arr[],int k,int i){
        if(i==arr.length){
                return i;
        }
      
        if(arr[i]==k){
            
           System.out.print(i+" ");
            
            
        }
        
        
        return Findelement(arr, k, i+1);
    }
    public static void main(String[] args) {
        int arr[]={3,2,4,5,6,2,7,2,2};
        System.out.println(Findelement(arr,2,0));
    } 
}
