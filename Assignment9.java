
public class Assignment9 extends Foo implements IntA, IntB, IntC, IntD {

	
	public int maxNumber(int a, int b, int c) {
		if (a>b && a> c)
			return a;
		else if (b>a && b> c)
			return b;
		else
			return c;
	}

	
	public void printPersonList(Person[] people) {
		for(int i=0;i<people.length;i++)
		 System.out.print(people[i]+ " ");

	}

	
	public boolean isMale(Person p) 
	{
		
		return p.isMale();
	}

	
	public void nameofYoungPeople(Person[] person, int n) 
	{
		for(int i=0;i<person.length;i++)
		{
		if(person[i].getAge() < n)
		{
			System.out.print(person[i]+ " ");
		}
		
	}
		}
	
	public boolean isPrime(int n) {
		if(n % 2 ==0)
			
			return false;
			for(int i=3; i*i<n;i+=2)
				if(n % i == 0)
					return false;
			return true;
	}


	
	public void sayHello() {
		System.out.println("Hello");
		
	}

}
