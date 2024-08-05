package Patterns;

public class Pattern24 {
    public static void main(String[] args) {
        int n = 4;
        int row = 1;

        while (row<=n) {
            
            int space = n -row;
            int temp = 1;
            while (temp <= space ) {
                System.out.print(" ");
                temp++;
            }

           int column = 1;
           while (column<=row) {
            System.out.print(row);
            column++;            
           }
           System.out.println();
           row++;       
        }
    }
}

/*

Output

   1
  22
 333
4444

*/