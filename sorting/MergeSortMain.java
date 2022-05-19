package com.greatlearning.sorting;

public class MergeSortMain {
	
	 
	public static void merge(int arr[],int beg,int end,int mid )
	{
 
	  int i,j,k;
	  int n1=mid-beg+1;
	  int n2=end-mid;
	  
	  int [] LeftArray =new int[n1];

	  int [] RightArray =new int[n2];
	  for(int l=0;l<n1;l++)
	  {
		  LeftArray[l]=arr[beg+l];
		  
	  }
	  
	  for(int l=0;l<n2;l++)
	  {
		  RightArray[l]=arr[mid+1+l];
		  
	  }
	  
	  i=0;
	  j=0;
	  k=beg;
	  
	  while(i<n1 && j<n2)
	  {
		  if(LeftArray[i]<=RightArray[j])
		  {
			  arr[k]=LeftArray[i];
			  i++;
		  }
		  else
		  {
			  arr[k]=RightArray[j];
			  j++;
		  }
		  k++;
	  }
	  while(i<n1)
	  {
		  arr[k]=LeftArray[i];
		  i++;
		  k++;
		  
	  }
	  while(j<n2)
	  {
		  arr[k]=RightArray[j];
		  j++;
		  k++;
	  }
	  
	  for(int ar:arr)
	  {
		  System.out.println(ar);
	  }
	  
	  System.out.println("==================");
	}
	
	public static void sort(int [] arr,int beg,int end)
	{
		if(beg<end)
		{
			int mid=(beg+end)/2;
			sort(arr,beg,mid);
			sort(arr,mid+1,end);
			 merge(arr, beg, end, mid);
		}
	}

	public static void main(String[] argsStrings) {
		int arr[]= {11,30,24,7,31,16,39,41};
		sort(arr, 0, arr.length-1);

	}

}
