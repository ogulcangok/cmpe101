import java.util.Scanner;
public class Worksheet5b //Beginnig of the class
{
public double avg( int m, int n) // a method to find average
{
double terms = m - n - 1;
double sum = 0;
	while (n < m-1)
	    {

	       sum = sum + n + 1;
		  n++;	         

			}
return sum/terms;
} //end of the method








public static void main (String args []) //beginning of the main method
{
Scanner input = new Scanner (System.in);  //Inıtilazing the input variable in Scanner.
System.out.println("Enter the first number");
int num1 = input.nextInt();
System.out.println("Enter the second number");
int num2 = input.nextInt();
Worksheet5b test = new Worksheet5b(); //Creating a sub class for calling the method in main method.
System.out.println("The average is: " + test.avg(num1,num2));






} //end of the main method.




}// end of the class.
