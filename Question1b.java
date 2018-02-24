
//creating a class.
public class Question1b 
{ //Definition of equation.
	public long equation (float x,long y)
	{
		return  (long)((x*x*x*x)+3*(y*y*y)-100*(x*x));
		
	}

	//beginning of main method.
	
	   public static void main (String[] args)
	{   

           //creating sub-class.
	   Question1b test1;
	   test1 = new Question1b();
	   
	   long f;
	   f = (long)(test1.equation(2,3));
	   //printing
	   System.out.println(f);
	}
	

}
