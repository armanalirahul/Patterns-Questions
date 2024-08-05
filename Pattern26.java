package Patterns;

public class Pattern26 {
    public static void main(String[] args) {
        int n = 4;
        int row = 1;
        int value = row;

        while (row <= n) {

            int space = n - row;
            int temp = 0;
            while (temp < space) {
                System.out.print(" ");
                temp++;
            }

            int column = 1;
            while (column<=row) {       
                System.out.print(value);
                column++;
                value++;              
            }
            System.out.println();
            row++;

        }
    }
}


/*
 
Output

   1
  23
 456
78910

 */