package Patterns;

public class Pattern9 {
    public static void main(String[] args) {
        //without third variable
        int n = 5;
        int row = 1;
        while (row<=n) {
            int column = 1;
            while (column<=row) {
                System.out.print(row+column-1+" ");
                column++;
            }            
            System.out.println();
            row++;
        }
    }
}



/*
 //with third variable
  while (row<=n) {
            int column = 1;
            int value = row;
            while (column<=row) {
                System.out.print(value+" ");
                value++;        
                column++;
            }
            System.out.println();
            row++;
            
        }

        
output

1 
2 3
3 4 5
4 5 6 7
5 6 7 8 9


 */
