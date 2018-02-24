public class Question2 
{ //The definition of the method.
	public double equation(long x,short y,float z)
	
	{	//Very long equation.
		return 3*(z*z)-10*(x*x*x)+100*(y*y)/(y*y*y*y)*(z*z)*(x*x*x);
		
	}
	// Main method.
	public static void main(String[] args)
	{
		
		//Testing method in the main method by creating sub-class.
		Question2 test;
		test= new Question2();
		double f;
		f =(double)(test.equation((long)(1),(short) (2),(float) (3)));
		
		//Printing.
		System.out.println(f);
		