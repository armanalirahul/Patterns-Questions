package Patterns;

public class Pattern25 {
    public static void main(String[] args) {
        int n = 4;
        int row = 1;
        
        while (row <= n) {

            int space = row - 1;
            int temp = 0;
            while (temp < space) {
                System.out.print(" ");
                temp++;
            }

            int column = 1;
            int start = n - row +1;
            int value = row;
            while (column <= start) {
                System.out.print(value);
                value++;
                column++;
            }
            System.out.println();
            row++;

        }
    }
}

//find its optimization.


/*
 
Output

1234
 234
  34
   4

 */