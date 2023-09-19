// *
// **
// * *
// *  *
// *****

public class Pettern9 {
    public static void main(String[] args) {
        int j,i;
        for(i=1;i<=5;i++){
            for(j=1; j<=i; j++){
                if(i==3&&j==2 || i==4&&  (j>1&&j<4)){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
