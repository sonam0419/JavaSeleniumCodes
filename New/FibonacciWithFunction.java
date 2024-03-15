package New;

class FibonacciClass
{
	public void fibonacci()
	{
		int a=0;
		int b=1;
		int c;
		
		for(int i=0; i<=100; i++)
		{
			c = a+b;
			System.out.println(c);
			a = b;
			b = c;
		}
	}
}
