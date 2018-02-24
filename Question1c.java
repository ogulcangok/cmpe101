public class Question1c 
{ //Definition of equation3.
	public float equation (long x,long y)
	{
		return  (float)((x*x*x*x)+3*(y*y*y)-100*(x*x));
		//beginning of main method.
	}
	public static void main (String[] args)
	{ //creating sub-class.
	   Question1c test1;
	   test1 = new Question1c();
	   
	   float f;
	   f = (float)(test1.equation(2,3));
	   //printing
	   System.out.println(f);
	}
	
//end of the main method
}
//end of the class