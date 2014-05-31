/**Noel Namai CSCI E-124*/

package cscie124.hw1;

public class FibonacciIterative
{	
	int[] f;
	
	private static final long START_TIME = System.nanoTime();
	
	public int fib(int n) throws RuntimeException
	{
		f = new int[n + 1];
			
		for (int i = 0; i <= n; i ++)
		{
			f[i] = (i < 2) ? i : f[i - 1] + f[i - 2];
		}
			
		if (f[n] < 0)
		{			
			throw new RuntimeException("Integer Overflow " + (System.nanoTime() - START_TIME) + " ns.");
		}
		
		return f[n];
	}
	
	public static void main(String []args)
	{		
		FibonacciIterative fibonacci = new FibonacciIterative();
		
		try
		{
			for (int i = 0; i >= 0; i ++)
			{
				System.out.println(fibonacci.fib(i));
			}
		}
		catch (RuntimeException e)
		{
			System.out.println(e.getMessage());
		}
	}
}