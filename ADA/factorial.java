import java.util.*;
class factorial
{
	public static void main(String[] args)
	{
		int n;
		int fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number whose factorial is to be calculated : ");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("the factorial of "+n+" is "+fact);
	}
}