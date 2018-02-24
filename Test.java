
public class Test 
{
public static void main (String args[])
{
	Person p1 = new Person("Oğulcan",18,true);
	Person p2 = new Person("Selim", 39, true);
	Person p3 = new Person ("Gizem", 27, false);
	Assignment9 test = new Assignment9();
	Person[] people = {p1,p2,p3};
	System.out.println(test.maxNumber(34,28,96));
	test.printPersonList(people);
	System.out.println("(Answer of isMale is"+" "+test.isMale(p3)+")");
	test.nameofYoungPeople(people, 30);
	System.out.println("(Answer of isPrime is"+" "+test.isPrime(33)+")");
	test.sayHello();

}
}
