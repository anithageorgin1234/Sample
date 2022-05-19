package com.greatlearning.linkedlist;

import java.util.Scanner;

public class SelectioSort {
	public static void sort(int[] arr)
	{
		int n=arr.length;
	
		//13	12	26	35	10
		for(int i=0;i<n-1;i++)
		{
			int index=i;//0
			for(int j=i+1;j< n ;j++)
			{
				if(arr[j]<arr[index])//12
				{
					index=j;//1
				}
			}
			int small=arr[index];
			arr[index]=arr[i];
			arr[i]=small;
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
 
