package a6;
class q5
{
	public static void main(String args[])
	{
		q5 ob = new q5();
		for(int a=2; a<=10000; a++)
		{
			if(ob.isPrime(a))
				System.out.println(a);
		}
	}
	public boolean isPrime(int number)
	{
		int c=0;
		for(int a=2; a<=Math.sqrt(number); a++)
		{
			if(number%a==0)
				c++;
		}
		return c==0;
	}
}