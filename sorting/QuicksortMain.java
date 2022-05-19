package com.greatlearning.sorting;

public class QuicksortMain {
	public static int divide(int arr[],int start,int end)
	{
		int pivot=arr[end]; 
		int i= start-1 ; 
		
		for(int j=start;j<=end;j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		
		int temp=arr[i+1];
		arr[i+1]=arr[end];
		arr[end]=temp;
		
		return(i+1);
	}
public static void quickSort(int arr[],int start,int end)
{
	if(start<end)
	{
		int part=divide(arr, start, end);
		quickSort(arr, start, part-1);
		quickSort(arr, part+1, end);
	}
}

	public static void main(String[] args) {
		int arr[]= {11,30,24,7,31,16,39,41};
		quickSort(arr, 0, arr.length-1);
		  for(int ar:arr)
		  {
			  System.out.println(ar);
		  }
	}

}
