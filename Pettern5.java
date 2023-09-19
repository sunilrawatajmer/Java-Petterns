// 1 
// 2 6
// 3 7 10
// 4 8 11 13
// 5 9 12 14 15

public class Pettern5 {
    public static void main(String[] args) {
        int i,j;
        int num=1,tmp;

        for(i=1; i<=5; i++){
             tmp = num;
            for(j=1; j<=i; j++){
                System.out.print(tmp+" ");
                tmp = tmp + (5-j);
            }
            System.out.println();
            num++;
        }
    }
}
