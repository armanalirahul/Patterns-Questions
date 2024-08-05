package Patterns;

public class Pattern7 {
 public static void main(String[] args) {
    
    int n = 5;
    int row = 1;

    while (row<=n) {
        int column = 1;
        while (column<=row) {
            System.out.print(row+" ");
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
2 2
3 3 3
4 4 4 4
5 5 5 5 5


 */
