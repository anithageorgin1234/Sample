package com.greatlearning.linkedlist;

import java.util.Scanner;

public class BubbleSort {
public static void sort(int[] arr)
{
	int n=arr.length;
	int temp=0;
	
	for(int i=0;i<n;i++)
	{
		for(int j=1;j<(n-i);j++)
		{
			if(arr[j-1]>arr[j])
			{
				temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
			}
		}
	}
	
}
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.print("Enter number of elements in the array :");
		int n=in.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter Elements");
		for( int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		System.out.println("Elements before sorting");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		sort(arr);
		System.out.println("Elements after sorting");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}

}
