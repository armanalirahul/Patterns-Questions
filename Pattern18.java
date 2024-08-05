package Patterns;

public class Pattern18 {
    public static void main(String[] args) {
        int n = 4;
        int row = 1;
        while (row <= n) {
            int column = 1;
            while (column <= row) {
                System.out.print((char)('A'+row+column-2)+" ");
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
B C
C D E
D E F G


 */
