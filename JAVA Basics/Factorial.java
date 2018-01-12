import java.util.Scanner;

public class Factorial
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = scan.nextInt();

		int fact=1;
		for(int i=n ; i>=1 ; i--)
		{
			fact *= i;
		}

		System.out.printf("The factorial of %d is %d" , n , fact);
	}
}