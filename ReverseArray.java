public class ReverseArray {
    public static void main(String args[]){
        int arr[]={2,4,6,8,10};
        int si=0;
        int ed=arr.length-1;
        while (si<ed) {
            int temp= arr[si];
            arr[si]=arr[ed];
            arr[ed]=temp;
            si++;
            ed--;

        }
        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index]   );
        }


    }
}
