public class PrimePattern {
    public static void main(String[] args) {
        int p=2;
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                while(true){
                    int k;
                    for(k=2; k<=p; k++){
                        if(p%k==0){
                            break;
                        }
                    }
                    if(p==k){
                        System.out.print(p++ +" ");
                        break;
                    }else{
                        p++;
                    }
                }
            }
            System.out.println();
        }
    }
}
