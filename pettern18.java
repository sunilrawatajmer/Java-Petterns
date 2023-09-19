//      1 
//     1 1
//    1 2 1
//   1 3 3 1
//  1 4 6 4 1

public class pettern18 {
    public static void main(String[] args) {
        int i, j,k;
        for(i=0;i<=4;i++){
            for(j=4;j>=i;j--){
                System.out.print(" ");
            }
            int val=1;
            for(k=0;k<=i;k++){
                System.out.print(val+" ");
                val=val*(i-k)/(k+1);
            }
             System.out.println();
            }
        }
    }

