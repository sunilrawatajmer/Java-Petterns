//         1 
//       3 3 3   
//     5 5 5 5 5 
//   7 7 7 7 7 7 7 
// 9 9 9 9 9 9 9 9 9

public class Pettern7 {
    public static void main(String[] args) {
        int i, j, num = 1;

        // Outer loop for rows
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5 - i; j++) {
                System.out.print("  ");
            }

            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print(num + " ");
            }
            System.out.println();
            num = num + 2;
        }
    }
}
