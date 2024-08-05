package Patterns;

public class Pattern12 {
    public static void main(String[] args) {
        
        int n = 3;
        int row = 1;
        while (row<=n) {
            int column = 1;
            int ch = 65;
            while (column<=n) {
                System.out.print((char)(ch+column-1)+" ");
                column++;
            }
            System.out.println();
            row++;
        }
    }
}


/*

output

A B C 
A B C
A B C

 */