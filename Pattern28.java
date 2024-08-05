package Patterns;

public class Pattern28 {
    public static void main(String[] args) {

        int n = 4;
        int row = 1;

        while (row <= n) {
            int value = row;
            int column = 1;
            while (column <= row) {
                System.out.print(value);
                value--;
                column++;
            }
            System.out.println();
            row++;
        }
    }
}

/*
 
Output

1
21
321
4321

 */
