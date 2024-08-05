package Patterns;

public class Pattern4 {
    public static void main(String[] args) {
        int n = 4;
        int row = 1;

        while (row<=n) {
            int column = 1;
            while (column<=n) {
                System.out.print(n-column+1);
                column++;
            }
            System.out.println();
            row++;
        }
    }
}

/*
 
output

4 3 2 1
4 3 2 1
4 3 2 1
4 3 2 1

 */
