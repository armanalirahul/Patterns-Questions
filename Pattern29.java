package Patterns;

public class Pattern29 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;

        while (row <= n) {

            int column1 = 1;
            while (column1 <= n - row + 1) {
                System.out.print(column1);
                column1++;
            }

            int column2 = 1;
            while (column2 <= row - 1) {
                System.out.print("*");
                column2++;
            }

            int column3 = 1;
            while (column3 <= row - 1) {
                System.out.print("*");
                column3++;
            }

            int column4 = 1;
            int value = n - row + 1;
            while (column4 <= n - row + 1) {
                System.out.print(value);
                value--;
                column4++;
            }

            System.out.println();
            row++;
        }
    }
}


/*
 
Output

1234554321
1234**4321
123****321
12******21
1********1

 */