class Worksheet10b
{
	public int evenSum(int[][] a)
	{
      int sum=0;
      for(int i=0;i<a.length;i++)
      {
      	for(int j=0;j<a[0].length;j++)
      	{
      		if((a[i][j]%2==0))
      		sum=sum+a[i][j];
      	}

      }
            return sum;
	}

	public static void main(String args[])
	{
      int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
      Worksheet10b test = new Worksheet10b();
      System.out.println("Sum is"+ test.evenSum(a));

	}

}