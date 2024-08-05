package Patterns;

public class Pattern21 {
    public static void main(String[] args) {
        int n = 4;
        int row = 1;
       
        while (row<=n) {
            
            int star = n - row +1;
            while (star>=1) {
              System.out.print("*");
              star--;
            }
            System.out.println();
            row++;
          }
    }
}

/*
 
Output

****
***
**
*  


 */
