import java.util.Scanner;
public class ex{
   public static int[] RevArray(int nums[]){
    int temp[]=new int[nums.length];
    for(int i=nums.length-1;i>0;i--){
        temp[i]=nums[i];
    }
    return temp;
   }
    public static void takeInput(int nums[]){
        Scanner sc=new Scanner(System.in);
     System.out.println("ENTTER YOUR DIGITS");
     for (int i = 0; i < nums.length; i++) {
        nums[i]=sc.nextInt();
     }
     
    }
    public static void printARR(int nums[]){
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            
        }
        System.out.println();
    }
    public static int FindLargest(int nums[]){
      int max = Integer.MIN_VALUE;
      for(int i=0;i<nums.length;i++){
        if(max<nums[i]){
            max=nums[i];
        }
      }
      return max;
    }
    public static void main(String[] args) {
        int arr[]=new int[5];
        takeInput(arr);
        printARR(arr);   
        System.out.println("The largest Value is "+FindLargest(arr));    
        System.out.println(RevArray(arr)); 
    }
}