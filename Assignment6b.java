import java.util.Scanner;
class Assignment6b
{
public static void main (String args [])

{	
Scanner input = new Scanner (System.in);
System.out.println("Enter the row number n");
int	n =input.nextInt();
System.out.println("Enter the colomn number m");
int m=input.nextInt();

Assignment6b test = new Assignment6b();
test.shape(n, m);

}	

public void shape(int n, int m) 

{

            for(int i=n; i>=1; i--) {

               for(int j=1; j<=i; j++) {

                  System.out.print(" " +j);
 
             }   
                  System.out.println();

             }

}



 
 
 










 



 }








