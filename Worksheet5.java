public class Worksheet5 //Class name
{

public static void main (String args[]) //Beginning of main method
{
int i = 0; 
int number = 0;
 int x = 0;
 int sum = 0;
 int j = 10;
do  { //Beginning of "do"
 	
i++; 
while ( j <= i) { //Nested while
	j--;    
	number++;

	sum = sum + (j - i); }
	
 }
while ( i <= 10); //While of "do".

   System.out.println(sum);
   



} //End of the main method.
}// End of the class.


     

 














