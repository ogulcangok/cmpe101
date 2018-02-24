class Person
{
private String name;
private String surname;
private String school;

public Person ()
{

}
public Person (String name)
{
this.setName(name);

}
public Person (String name , String surname)
{
this.setName(name);
this.setSurname(surname);
}
public Person(String name , String surname , String school)
{
this.setName(name);
this.setSurname(surname);
this.setSchool(school);
}

public String getName()
{
return name;
}
public void setName (String name)
{
this.name=name;
}
public String getSurname (String surname)
{
return surname;
}
public void setSurname (String surname)
{
this.surname=surname;	
}
public String getSchool (String school)
{
return school;	
}
public void setSchool (String school)
{
this.school=school;
}
public String toString()
{
return name+" "+surname+" "+school;	
}


}