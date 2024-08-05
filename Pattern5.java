package Patterns;

public class Pattern5 {
    public static void main(String[] args) {
        int n = 3;
        int row = 1;
        int count = 1;

        while (row<=n) {
            int column = 1;
            while (column<=n) {

                System.out.print(count);
                count++;
                column++;
            }
            System.out.println();
            row++;
        }
    }
}

/*

output

1 2 3
4 5 6 
7 8 9

*/
