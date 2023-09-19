//    1 
//   2 2
//  3 3 3
// 4 4 4 4
//  3 3 3
//   2 2
//    1

class Pettern3 {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(i+" ");
            }

            System.out.println();
        }

         for (int i = 3; i >= 1; i--) {
            int j;
            for ( j = 3; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(i+" ");
            }

            System.out.println();
        }
    }
}
