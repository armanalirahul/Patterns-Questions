package Patterns;

public class Pattern20 {
    public static void main(String[] args) {

        int n = 4;
        int row = 1;

        while (row <= n) {

            // space print
            int space = n - row;
            while (space > 0) {
                System.out.print(" ");
                space--;
            }

            //star print
            int column = 1;
            while (column<=row) {
                System.out.print("*");
                column++;               
            }
            System.out.println();
            row++;
        }
    }
}

/*
 
Output

   *
  **
 ***
****


 */
