//  * * * * *
//   * * * *
//    * * *
//     * *
//      *
 public class Pettern15 {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++) {
             for(j=2;j<=i;j++){
                System.out.print(" ");
             }
             for(j=6-i;j>=1;j--){
                System.out.print(" *");
             }
            System.out.println();
        }
    }
}
