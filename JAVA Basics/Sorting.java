import java.util.Scanner;

public class Sorting
{
	public static void main(String[] args)
	{
		Sort s = new Sort();

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = scan.nextInt();

		int [] A = new int [n];

		System.out.println("Enter the array elements: ");
		for(int i=0; i<n ; i++)
			A[i] = scan.nextInt();

		s.Bubble(A , n);

		System.out.println("The sorted array is: ");
		for(int i=0 ; i<n ; i++)
			System.out.printf("%d " , A[i]);
	}

}

class Sort
{
	public static void Bubble(int[] X , int n)
	{
		int temp;
		for(int i=0 ; i<n-1 ; i++)
			for(int j=0 ; j<n-1 ; j++)
				if(X[j] > X[j+1])
				{
					temp = X[j];
					X[j] = X[j+1];
					X[j+1] = temp;
				}
	}
}