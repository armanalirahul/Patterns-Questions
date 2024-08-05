package Patterns;

public class Pattern19 {
    public static void main(String[] args) {
        int n = 4;
        int row = 1;
        while (row<=n) {
            int column = 1;
            char value = 'A';
            while (column<=row) {
                System.out.print((char)(value+n-row)+" ");
                value++;
                column++;
            }
            System.out.println();
            row++;            
        }
    }
}

/*
 
OUTPUT

D 
C D
B C D
A B C D


 */
