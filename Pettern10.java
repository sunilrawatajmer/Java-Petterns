//    *   
//   *A*  
//  *A*A* 
// *A*A*A*

class Pettrn10{
    public static void main(String[] args) {
        int i,j,s;
        for(i=1;i<=4;i++){
            for(j=1;j<=4-i; j++){
                System.out.print(" ");
            }
            for(j=1;j<=2*i-1;j++)
            {
                if(j%2==0){
                    System.out.print("A");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
 }