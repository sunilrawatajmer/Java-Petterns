// *        *
// **      **
// ***    ***
// ****  ****
// **********
// **********
// ****  ****
// ***    ***
// **      **
// *        *


public class ButterflyPettern {
    public static void main(String[] args) {
        int i,j,k;
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            for(k=1;k<=10-2*i;k++){
                System.out.print(" ");
            }
           for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    for(i=5;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            for(k=1;k<=10-2*i;k++){
                System.out.print(" ");
            }
           for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
