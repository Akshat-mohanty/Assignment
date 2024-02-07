package a4;
import java.util.*;
class q7
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the value of N :");
		int n=in.nextInt();
		double s=0;
		for(int a=0; a<n; a++)
		{
			double temp=Math.random();
			s+=temp;
			System.out.println(temp);
		}
		s=s/n;
		System.out.println("Average ="+s);
	}
}