class Recursion
{
	public static void main(String[] args)
	{
		int num=6;
		boolean res=powerOfANumber(6,0);
		if(res)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
	public static boolean powerOfANumber(int num,int i)
	{
		int pow=(int)Math.pow(2,i);
		if(pow>num)
		{
			return false;
		}
		if(pow==num)
		{
			return true;
		}
		return powerOfANumber(num,++i);
	}
}

