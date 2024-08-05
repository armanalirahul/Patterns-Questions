package Patterns;

public class Pattern16 {
    public static void main(String[] args) {
        int n = 3;
        int row = 1;
        while (row <= n) {
            int column = 1;
            while (column<=row) {
                System.out.print((char)('A'+row-1)+" " );
                column++;
            }
            System.out.println();
            row++;
        }
    }
}


/*
 
OUTPUT

A 
B B
C C C


 */
