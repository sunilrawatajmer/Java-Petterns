// 1 
// 3 2 
// 6 5 4 
// 10 9 8 7 
// 15 14 13 12 11 


public class Pettern6 {
    public static void main(String[] args) {
        int i, j;
        int tmp, count = 0;

        for (i = 1; i <= 5; i++) {
            count = count + i;
            tmp = count;
            for (j = 1; j <= i; j++) {
                System.out.print(tmp + " ");
                tmp--;
            }
            System.out.println();
        }
    }
}
