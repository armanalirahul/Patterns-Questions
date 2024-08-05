package Patterns;

public class Pattern2 {
   
    public static void main(String[] args) {
        
System.out.println("**********starting***********");

            int n = 3;
            int row = 1;
            
            while (row<=n) 
            {
                int column =1;
                while(column<=n){
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

1 1 1 
2 2 2 
3 3 3 

 */


