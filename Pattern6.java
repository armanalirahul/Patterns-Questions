package Patterns;

public class Pattern6 {
    public static void main(String[] args) {
        System.out.println("****starting*****");

        int n = 5;

        int row = 1;
        
        while (row<=n) {
            
                int column =  1;

                while(column<=row) {
                    System.out.print("* ");
                    column++;
                }
                System.out.println();
                row++;
        }


    }
}

/*output

* 
* *
* * *
* * * *
* * * * *

*/