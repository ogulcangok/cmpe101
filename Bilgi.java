

public class Bilgi //For getting null Bilgi class for b1.
{
	private String name ;
	private int year;
	private double area;

	public Bilgi(String name, int year,double area) //to get  name year and area for b2
{
this.name= name;
this.year= year;
this.area=area;
}
public String toString()
{
return "Name: "+ name + " year: "+ year +" and area: " + area;
}


public Bilgi(){
	
}
public Bilgi (String name, int year) // to get name and year for b1.
{
this.name= name;
this.year= year;
}
public Bilgi(String name)
{
this.name= name;
}
public String getBilgi(String name, int year, double area) //to get data for the class
{
return name +"," +year +"," +area;
}
public String getBilgi(String name, int year)//to get data for the class
{
return name+ ","+ year;
}
public String getBilgi(String name)//to get data for the class
{
return name;
}
public String getBilgi()//to get data for the class
{
return " ";
}
public static void main (String args[])
{
Bilgi b= new Bilgi("Istanbul");
Bilgi b1= new Bilgi("Itu", 1997);
Bilgi b2= new Bilgi("Bilgi", 2000, 23.57);
Bilgi b3= new Bilgi();
System.out.println(b); //Prints name.
System.out.println(b1);//Prints year and name.
System.out.println(b2);//Prints name, year and area.
System.out.println(b3);//Prints null.
}



}
