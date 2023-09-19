// 10101
// 01010
// 10101
// 01010
// 10101

public class pettern21 {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++) {
            for(j=1;j<=5;j++){
                int num = (i+j)%2==0?1:0;
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
