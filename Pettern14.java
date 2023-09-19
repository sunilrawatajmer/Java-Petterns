// E D C B A 
// E D C B 
// E D C 
// E D 
// E 

public class Pettern14 {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++) {
             int n =69;
            for(j=i;j<=5;j++){
                System.out.print((char)n+" ");
                n--;
            }
            System.out.println();
        }
    }
}
