//     A
//    ABA
//   ABCBA
//  ABCDCBA
// ABCDEDCBA

public class pettern17 {
    public static void main(String[] args) {
        int i, j,k,a;
        for(i=1;i<=5;i++){
            int ch=65;
            for(j=4;j>=i;j--){
                System.out.print(" ");
            }
            for(k=1;k<=i;k++){
                System.out.print((char)ch);
                ch++;
            }
            ch--;
            for(a=2;a<=i;a++){
                ch--;
                System.out.print((char)ch);
            }
            System.out.println();
        }
    }
}
