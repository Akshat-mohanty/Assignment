package a3;
import java.util.Scanner;
class q3
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number :");
		int n=in.nextInt();
		if(n%2==0)
			System.out.print(n+" is even");
		else
			System.out.print(n+" is odd");
	}
}