
public class Person 
{
	private String name;
	private int age;
	private boolean male;
	public Person(String name, int age, boolean male)
	{
	this.age=age;
	this.name=name;
	this.male=male;
}
	@Override
	public String toString() {
		return "name=" + name + ", age=" + age + ", male=" + male;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isMale() {
		return male;
	}
	public void setMale(boolean male) {
		this.male = male;
	}
}
