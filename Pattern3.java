package Patterns;

public class Pattern3 {

    public static void main(String[] args) {
        
            int n = 4;
            int row = 1;

            while (row<=n) {
                int column = 1;
                while (column<=n) {
                 System.out.print(column);
                 column++;                    
                }         
                System.out.println();
                row++;  
            }
    }
}


/*
 
output

1 2 3 4
1 2 3 4
1 2 3 4

 */
