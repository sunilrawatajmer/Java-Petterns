//     *    
//    * *
//   * * *
//  * * * *
// * * * * *
//  * * * *
//   * * *
//    * *
//     *

class DiamondPettern {
    public static void main(String[] args) {
        int k=1,i,j;
        for ( i = 1; i <= 5; i++) {
            for ( j = 1; j <= 9; j++) {
                if (j >= 6 - i && j <= 4 + i && k==1) {
                    System.out.print("*");
                    k=0;
                } else {
                    System.out.print(" ");
                    k=1;
                }
            }
            System.out.println();
        }

         for ( i = 4; i >= 1; i--) {
            for ( j = 1; j <= 9; j++) {
                if (j >= 6 - i && j <= 4 + i && k==1) {
                    System.out.print("*");
                    k=0;
                } else {
                    System.out.print(" ");
                    k=1;
                }
            }
            System.out.println();
        }
    }
}