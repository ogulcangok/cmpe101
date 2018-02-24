class Worksheet10c
{
	public int[] sort(int[]a)
	{
		int minIndex;
		for(int i=0;i<a.length;i++)
		{
			minIndex=i;
			for(int j=1;j<a.length;j++)
			{
				if(a[minIndex]<a[j])
					minIndex=j;

			}
			int temp=a[i];
			a[i]=a[minIndex];
			a[minIndex]=temp;
		}
		return a;
	}

	public void sortEven(int[]a)
	{
	sort(a);
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2==0)
		{
			System.out.print(a[i]+" ");
			

		}
	}
}

public static void main(String args[])
{
	Worksheet10c test=new Worksheet10c();
	int[]x={9,1,8,2,7,3,6,4,5};
	test.sortEven(x);
}

}