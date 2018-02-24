import java.util.Scanner;
class Test
{
	
public static void main (String args [])
{
	Drums d1 = new Drums ();
	Scanner input = new Scanner (System.in);
	System.out.println("What is the name of the brand?");
	d1.setBrand(input.nextLine());
	System.out.println("What kind of wood do you prefer?");
	d1.setWood(input.nextLine());
    System.out.println("What should be the diameter?");
	d1.setDiameter(input.nextInt());
	System.out.println("Which color do you prefer?");
	d1.setColor(input.next());
	System.out.println("How many drums would you like to have in your set-up?");
	d1.setNumberOfDrums(input.nextInt());
	System.out.println("Your drum set-up is" + d1.toString());






}







}