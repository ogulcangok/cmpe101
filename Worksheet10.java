class Worksheet10
{
	public int sum(int x, int y)
	{
	return x+y;
	}

public static void main(String args[])
{
	Worksheet10 test = new Worksheet10();
	String a=args[0];
	String b=args[1];
	int firstNumber=Integer.parseInt(a);
    int secondNumber=Integer.parseInt(b);
    System.out.println("The sum is"+ " "+test.sum(firstNumber,secondNumber));
  }

}