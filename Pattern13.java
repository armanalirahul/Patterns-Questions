package Patterns;

public class Pattern13 {
    public static void main(String[] args) {
         int n = 3;
            int row = 1;
            int ch = 65;
                while (row<=n) {
                    int column = 1;
                    while (column<=n) {
                     System.out.print((char)(ch)+" ");
                     ch++;
                     column++;                           
                    }
                    System.out.println();
                    row++;
                }             
    }
}

/*
 
output

A B C 
D E F 
G H I 

 */
