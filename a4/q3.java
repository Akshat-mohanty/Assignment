package a4;
import java.util.*;
class q3
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number to count to :");
		int i=in.nextInt();
		for(int a=0; a<=i; a++)
			System.out.print(a+"\t");
	}
}