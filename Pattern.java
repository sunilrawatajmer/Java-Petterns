public class Pattern {
    public static void main(String[] args) {
        int k=1; 
        for(int i = 1; i<=5; i++){
            
            for(int j=1; j<=9; j++){
               
                if(j>=6-i&&j<=4+i){
                    
                    System.out.print(k);
                     k = (j < 5) ? k-1 : k+1;
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }                                                                                                                  
    }
}
