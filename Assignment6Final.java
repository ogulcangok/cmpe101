import java.util.Random;
class Assignment6
{
	
	public int [][] random(int x,int y)//Method for generating random list.
	{
		int [][] a= new int[x][y];
		for(int i=0;i<x;i++)
		{
			for(int j=0;j<y;j++)
			{
				a[i][j]=(int)(Math.random()*100);
				
			}
			
			
		}
		
		return a;
	}
	
	public void display(int[][]b)//Method for printing the 2D array.
	{
		
		int r=b.length;
		int c=b[0].length;
		for(int i=0;i<r;i++)//I merged row average and display loops.(Beginning of display loop).
		{
			int sum=0;
			
			double average=0;
			
			for(int j=0;j<c;j++)
			{
				sum=sum+b[i][j];//Loop for adding all elements in a row.
				
				
				System.out.print("\t"+"\t"+b[i][j]+"\t");//Printing the row.
				
				
			}
			average=sum/c;
			
		System.out.printf("%2.2f",average);//Printing the average near the last element of the row.
		System.out.println();
		}
		for(int i=0;i<c;i++)//Begining of the column average loop.
		{
			int sum2=0;
			double average2=0;
			for(int j=0;j<r;j++)
			{
				sum2=sum2+b[j][i];
			}
			
			average2=sum2/r;
			System.out.print("\t"+"\t"+average2+"\t");//Printing the average under the last element of the row.
			}
		
		System.out.println();
		/*System.out.print("Average of "+" ");
		
		System.out.println();
		System.out.print("Columns"+" ");*/
	}//end of the display method.
		
		
	public static void main(String args[])
	{//beginning of the main method.
		Assignment6 test = new Assignment6();
		//System.out.println("----------------------------------------------------------------------------------------------Average of rows");
		//test.display(test.random(3,4));//test of the method.
		
		
		//Getting input from the command line.
		String x= args[0];
		String y= args[1];
                    
         int row= Integer.parseInt(x);
         int column= Integer.parseInt(y);
         test.display(test.random(row,column));          
		
		
	}

}//End of the class.