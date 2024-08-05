package Patterns;

public class Pattern8 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int count = 1;

        while (row<=n) {
            int column = 1;
            while (column<=row) {
                System.out.print(count+ " ");
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

1 
2 3
4 5 6
7 8 9 10
11 12 13 14 15

 */
