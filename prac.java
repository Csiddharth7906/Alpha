public class prac{
     public static int BinarySearch(int arr[],int key){
      int si=0;
      int ed=arr.length-1;
    
       
      while(si<=ed){
        int mid = ed+si/2;
        if(key==arr[mid]){
            return mid;
        }
        if (arr[mid]>key) {
            ed = mid-1;
        }
        else{
            si=mid+1;
        }
    }
    return -1;
      
      
     }


  public static void main(String[] args) {
    int arr[]={2,4,6,8,10,12,14};
    int key=10;
    System.out.println(BinarySearch(arr, key));

  }
}