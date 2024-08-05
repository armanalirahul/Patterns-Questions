package Patterns;

public class Pattern14 {
    public static void main(String[] args) {
        int n = 3;
        int row = 1;
        while (row<=n) {
            int column = 1;
            while (column<=n) {
               System.out.print((char)('A'+row+column-2)+" ");
                column++;
            }
            System.out.println();
            row++;
        }
    }
}


// Find easy way like pattern19

/*
  
output 


A B C 
B C D
C D E


*/






/*
 
second way

        int n = 3;
        int row = 1;
        int ch = 65;
        while (row<=n) {
            int column = 1;
            while (column<=n) {
                System.out.print((char)(ch+row+column-2)+" ");
                column++;
            }
            System.out.println();
            row++;
        }


 */





/*
 
third way but it not recommended 

         int n = 3;
        int row = 1;
        int count = 0;
        int ch = 65;
        while (row<=n) {
            int column = 1;
            while (column<=n) {
                System.out.print((char)(ch+count+column-1)+" ");
                column++;
            }
            System.out.println();
            count++;
            row++;
        }

 */



 