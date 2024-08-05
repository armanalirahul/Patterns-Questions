package Patterns;

public class Pattern11 {
    public static void main(String[] args) {
        int n = 3;
        int row = 1;
        int ch = 65;
        while (row<=n) {
            int column = 1;
            while (column<=n) {
                System.out.print((char)(ch+row-1)+" ");
                column++;
            }
            System.out.println();
            row++;
        }
    }
}


/*
 
output

A A A 
B B B
C C C


 */
