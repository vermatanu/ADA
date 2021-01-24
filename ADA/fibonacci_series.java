import java.util.*;
class fibonacci_series
{
    public static void main(String[] args) 
    {
        int n;
        int a=0,b=1,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no till which series is to be calculated");
        n=sc.nextInt();
        sc.close();
        System.out.println("the series is :");
        System.out.println(a);
        System.out.println(b);
        for(int i=2;i<n;i++)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
           // System.out.println(c);
        }
    }
}