package Patterns;

public class Pattern10 {
    public static void main(String[] args) {
        
            int n = 4;
            int row = 1;

            while (row<=n) {
                int column = 1;
                while (column<=row) {
                    System.out.print(row-column+1+" ");
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
2 1
3 2 1
4 3 2 1

 */

