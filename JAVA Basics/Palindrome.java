import java.util.Scanner;

public class Palindrome
{
	public static void main(String[] args)
	{
		System.out.println("Enter the string: ");
		Scanner scan = new Scanner(System.in);
		String palin = scan.nextLine();

		int l = palin.length();

		int flag=1;
		for(int i=0 , j=l-1 ; i<(l/2) ; i++ , j--)
		{
			if(palin.charAt(i) != palin.charAt(j))
			{
				flag = 0;
				break;
			}
		}

		if(flag == 1)
			System.out.println("The string is a palindrome!");
		else
			System.out.println("The string is not a palindrome!");
	}
}