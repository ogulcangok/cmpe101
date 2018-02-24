public class Question1 
{ //Definition of equation.
	public int equation (int x,int y)
	{
		return ((x*x*x*x)+3*(y*y*y)-100*(x*x));
		//beginning of main method.
	}
	public static void main (String[] args)
	{ //creating sub-class.
	   Question1 test1;
	   test1 = new Question1();
	   
	   short f;
	   f = (short)(test1.equation(2,3));
	   //printing
	   System.out.println(f);
	}
	

}