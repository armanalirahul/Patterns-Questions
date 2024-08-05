package Patterns;

public class Pattern22 {
    public static void main(String[] args) {
        int n = 4;
        int row = 1;
        
        while (row<=n) {

            int space = row -1;
            int temp = 0;
            while (space > temp) {
                System.out.print(" ");
                temp++;
            }

            int column = 1;
            int star = n-row+1;
            while (column <= star) {
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

****
 ***
  **
   *


 */