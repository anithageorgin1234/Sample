package com.greatlearning.linkedlist;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void binarySearch(int arr[],int key)
	{
		int first=0,last=arr.length,mid=(first+last)/2;
		while(first<=last)
		{
			if(arr[mid]==key)
			{
				System.out.println("Element at postion "+(mid+1));
				break;
			}
			else if(arr[mid]<key)
			{
				first=mid+1;
			}
			else
			{
				last=mid-1;
			}
			mid=(first+last)/2;
		
		}
		if(first>last)
		{
			System.out.println("element not found");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in= new Scanner(System.in);
		System.out.print("Enter number of elements in the array :");
		int n=in.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter Elements");
		for( int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Elements after sorting");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		System.out.println("Enter element needs to search");
		int key=in.nextInt();
		binarySearch(arr,key);
	}

}
