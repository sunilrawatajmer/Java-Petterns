// 5 4 3 2 1 
// 5 4 3 2 
// 5 4 3 
// 5 4 
// 5 

public class pettern12 {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++) {
            int n=5;
            for(j=i;j<=5;j++){
                System.out.print(n+" ");
                n--;
            }
            System.out.println();
        }
    }
}
