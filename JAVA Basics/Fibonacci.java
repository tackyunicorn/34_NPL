import java.util.Scanner;

public class Fibonacci
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = scan.nextInt();

		if(n == 1)
			System.out.printf("\n0");
		else if(n == 2)
			System.out.printf("\n0 1");
		else
		{
			int fib1=0 , fib2=1;
			System.out.printf("\n0 1");
			for(int i=3; i<=n ; i++)
			{
				int fib = fib1 + fib2;
				System.out.printf(" %d " , fib);

				fib1 = fib2;
				fib2 = fib;
			}
		}
	}
}