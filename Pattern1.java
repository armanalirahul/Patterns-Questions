package Patterns;

class Pattern1{
    public static void main(String[] args) {
        System.out.println("*******starting********");
        int n = 3;
        int row = 1;

        while(row<=n){

            int column = 1;

            while (column<=n) {
                System.out.print("* ");
                column++;
            }
            System.out.println();
            row++;
        }
    }
}


/*

output

* * *
* * *
* * *

*/