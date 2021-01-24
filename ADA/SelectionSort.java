import java.util.*;
class SelectionSort
{
	void sort(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			int min_indx=i;
			for(int j=i+1;j<n;j++)
				if(arr[j]<arr[min_indx])
					min_indx=j;
			int temp=arr[min_indx];
			arr[min_indx]=arr[i];
			arr[i]=temp;	
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
		SelectionSort s=new SelectionSort();
		s.sort(arr);
		System.out.println("the sorted array is : ");
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
	}
}