public class Arrays{
    public static void linearsearch(int arr[],int key){
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]==key){
                    System.out.print("value faound at "+i);
                }
               
            }
    }
    public static int LargestNumber(int arr[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
              if (largest < arr[i]) {
                largest = arr[i];
              }
              if (smallest>arr[i]) {
                smallest = arr[i];
              }
        }
        return smallest;
       
         
    }
    public static void main(String[] args) {
        int arr[]= {1,9,5,4,6};
        int key = 5;
        //linearsearch(arr, key);
       System.out.println(LargestNumber(arr));
    }
}