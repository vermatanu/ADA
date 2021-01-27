import java.util.*;
class MergeSort
{
    void Merge(int a[],int lb,int mid,int ub)
	{
		int i=lb, j=mid+1,k=lb;
		int b[]=new int[ub+1];
		while(i<=mid&&j<=ub)
		{
			if(a[i]<=a[j])
			{
				b[k]=a[i];
				i++;k++;
			}
			else
			{
				b[k]=a[j];
				j++;k++;
			}
		}
		if(i>mid)
		{
			while(j<=ub)
			{
				b[k]=a[j];
				j++;k++;
			}
		}
		else if(j>ub)
		{
			while(i<=mid)
			{
				b[k]=a[i];
				i++;k++;
			}
		}
		for (int z = lb; z < ub + 1; z++) 
		{
			a[z] = b[z];
		}
	}

	void Mergesort(int a[],int lb,int ub)
	{
        if(lb<ub)
        {
        	int mid=(lb+ub)/2;
        	Mergesort(a,lb,mid);
        	Mergesort(a,mid+1,ub);
        	Merge(a,lb,mid,ub);
        }
	}

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the no of elements in array :");
		int n=sc.nextInt();
		int[] arr =new int[n];
		System.out.print("enter the elements of the array : ");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		MergeSort s=new MergeSort();
		s.Mergesort(arr,0,(n-1));
		System.out.println("the sorted array is : ");
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
	}
}