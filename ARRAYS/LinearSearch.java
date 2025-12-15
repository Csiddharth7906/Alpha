public class LinearSearch {
    public static int Search(int nums[],int key){
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr={2,5,8,3,23,34,32,45};
        int key=34;
        System.out.println("THe psition of the key "+key+" value is "+Search(arr, key));
    }
}
