class Drums // Beginning of the class.
{
private String brand;//Defining a clas variable
private String wood;//Defining a clas variable
private int diameter;//Defining a clas variable
private String color;//Defining a clas variable
private int numberOfDrums;//Defining a clas variable

public Drums () // No argument constructor.
{

}
public Drums (String brand) //Brand variable constructor
{
this.setBrand(brand);//If we use class variables we must use "this" keyword.

}
public Drums (String brand , String wood)//Brand and wood variable constructor
{
this.setBrand(brand);
this.setWood(wood);
}
public Drums (String brand , String wood , int diameter)//Brand, wood and diameter variable constructor
{
this.setBrand(brand);
this.setWood(wood);
this.setDiameter(diameter);
}
public Drums (String brand , String wood , int diameter , String color)//Brand, wood, diameter and color variable variable constructor
{
this.setBrand(brand);
this.setWood(wood);
this.setDiameter(diameter);
this.setColor(color);	
}
public Drums (String brand , String wood , int diameter , String color , int numberOfDrums)//Brand, wood, diameter and numberOf drums variable constructor
{
this.setBrand(brand);
this.setWood(wood);
this.setDiameter(diameter);
this.setColor(color);
this.setNumberOfDrums(numberOfDrums);	
}
public String getBrand() //We have to use get keyword in order to use variables is Test class.
{
return brand;
}
public void setBrand (String brand) //We can change the variable with set keyword.
{
this.brand=brand;
}
public String getWood (String wood)//We have to use get keyword in order to use variables is Test class.
{
return wood;
}
public void setWood (String wood)//We can change the variable with set keyword.
{
this.wood=wood;	
}
public int getDiameter (int diameter)//We have to use get keyword in order to use variables is Test class.
{
return diameter;	
}
public void setDiameter (int diameter)//We can change the variable with set keyword.
{
this.diameter=diameter;
}
public String getColor( String color)//We have to use get keyword in order to use variables is Test class.
{
return color;	
}
public void setColor (String color)//We can change the variable with set keyword.
{
this.color=color;
}
public int getNumberOfDrums (int numberOfDrums)//We have to use get keyword in order to use variables is Test class.
{
return numberOfDrums;	
}
public void setNumberOfDrums (int numberOfDrums)//We can change the variable with set keyword.
{
this.numberOfDrums=numberOfDrums;	
}
public String toString() //To get reasonable output, unless you get only memory adress.
{
return brand+" "+wood+" "+diameter+" "+color+" "+numberOfDrums;	
}


}