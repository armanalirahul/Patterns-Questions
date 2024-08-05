package Patterns;

public class Pattern15 {
    public static void main(String[] args) {
        int n =3;
        int row =1;
        while (row<=n) {
            int column =1;
            while (column<=n) {
                System.out.print(row+column-1+" ");
                column++;
            }
            System.out.println();
            row++;
        }
    }
}


/*
 
OUTPUT 


1 2 3 
2 3 4
3 4 5


 */