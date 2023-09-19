// 1 
// 0 1     
// 1 0 1   
// 0 1 0 1 
// 1 0 1 0 1

class Pettern4 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                int tmp = ((i+j)%2==0)?1:0;
                System.out.print(tmp+" ");
            }
            System.out.println();
        }
    }
}
