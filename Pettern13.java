// A 
// A B 
// A B C 
// A B C D 
// A B C D E

public class Pettern13 {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++) {
             int n =65;
            for(j=1;j<=i;j++){
                System.out.print((char)n+" ");
                n++;
            }
            System.out.println();
        }
    }
}
