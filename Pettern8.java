//     1  
//    2  2
       
//   3    3

//  4      4

// 5        5

//  4      4

//   3    3

//    2  2

//     1

public class Pettern8 {
    public static void main(String[] args) {
        int i,j;
        
        //Print Half part of pettern upper part
        for(i=1; i<=5; i++){
            for(j=4; j>=i; j--){
                System.out.print(" ");
            }
            for(int k=i; k<=i; k++){
                System.out.print(k);
            }

            for(int s=2;s<=2*i-1;s++){
                System.out.print(" ");
            }

            if(i>1){
                System.out.println(i);
            }
            System.out.println();
        }

        //Print Half part of pettern Lower part
        for(i=4; i>=1; i--){
            for(j=4; j>=i; j--){
                System.out.print(" ");
            }
            for(int k=i; k<=i; k++){
                System.out.print(k);
            }

            for(int s=2;s<=2*i-1;s++){
                System.out.print(" ");
            }

            if(i>1){
                System.out.println(i);
            }
            System.out.println();
        }
    }
}
