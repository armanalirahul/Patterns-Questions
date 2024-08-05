package Patterns;

public class Pattern27 {
    public static void main(String[] args) {
        int n = 4;
        int row = 1;

        while (row <= n) {

            // first triangle space

            int space = n - row;
            int temp = 0;
            while (temp < space) {
                System.out.print(" ");
                temp++;
            }

            // second triangle

            int column = 1;
            while (column <= row) {
                System.out.print(column);
                column++;
            }

            // third triangle

            int start = row - 1;
            int value = 1;
            while (start >= value) {
                System.out.print(start);
                start--;
            }

            System.out.println();
            row++;
        }

    }
}

/*
 
Output

   1
  121
 12321
1234321


 */
