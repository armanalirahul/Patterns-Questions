package Patterns;

public class Pattern23 {
    public static void main(String[] args) {

        int n = 4;
        int row = 1;

        while (row <= n) {

            int space = row - 1;
            int temp = 0;
            while (space > temp) {
                System.out.print(" ");
                temp++;
            }

            int column = 1;
            int value = n - row + 1;
            while (column <= value) {
                System.out.print(row);
                column++;
            }
            System.out.println();
            row++;

        }
    }
}

/*
 
OUTPUT

1111
 222
  33
   4

 */