package Patterns;

public class Pattern17 {
    public static void main(String[] args) {
        int n = 4;
        int row = 1;
        char value = 'A';
        while (row <= n) {
            int column = 1;
            while (column <= row) {
                System.out.print(value + " ");
                value++;
                column++;
            }
            System.out.println();
            row++;
        }
    }
}


/*

OUTPUT

A 
B C 
D E F 
G H I J 


 */