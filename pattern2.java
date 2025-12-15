public class pattern2 {
    public static void main(String arg[]){
        int n=4;
        int space = 2 * (n - 1);

    //     for (int i = 1; i <= n; i++) {
    //         // Print first half numbers
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print(j);
    //         }

    //         // Print spaces
    //         for (int k = 1; k <= space; k++) {
    //             System.out.print(" ");
    //         }

    //         // Print second half numbers
    //         for (int j = i; j >= 1; j--) {
    //             System.out.print(j);
    //         }

    //         System.out.println();
    //         space -= 2; // Decrease space after each row
    //     }
    // }

        // int space=2*(n-1);
          for(int i=1;i<=n;i++){
              //number
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
                //space
            for(int k=1;k<=space;k++){
                System.out.print(" ");
            }

                //number
            for(int j=i;j>=1;j--){
                System.out.print(j);
            } 
            System.out.println();
            space -=2;
         
        }
    }
    
}
