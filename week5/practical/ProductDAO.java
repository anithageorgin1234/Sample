package com.greatlearning.week5.practical;

import java.util.Scanner;

public class ProductDAO {
	Scanner in=new Scanner(System.in);
	Scanner inString =new Scanner(System.in);
	private Product array[];
	private int count;
	private int sizeOfArray;
	public ProductDAO() {
		 array=new Product[1];
		 count=0;
		 sizeOfArray=1;
	}
	public void addProduct()
	{
		System.out.println("Enter Product ID");
		int id=in.nextInt();
		
		System.out.println("Enter Product Name");
		String name=inString.nextLine();
		
		
		System.out.println("Enter Product price");
		int price=in.nextInt();
		
		Product P=new Product(id, name, price);
		if(count==sizeOfArray)
		{
			growsize();
		}
		array[count]=P;
		count++;
		listProduct();
	}
	public void updateProduct()
	{
		System.out.println("Enter Product ID");
		int id=in.nextInt();
		
		System.out.println("Enter Product Name");
		String name=inString.nextLine();
		
		
		System.out.println("Enter Product price");
		int price=in.nextInt();
		
		Product P=new Product(id, name, price);
		 System.out.println("Enter index to be removed");
		 int index=in.nextInt();
		 array[index]=P;
		 listProduct();
	}
	 public void growsize()
	    {
	    	Product temp[]=null;
	    	if(count==sizeOfArray)
	    	{
	    		temp=new Product[sizeOfArray+1];
	    	}
	    	for(int i=0;i<sizeOfArray;i++)
	    	{
	    		temp[i]=array[i];
	    	}
	    	array=temp;
	    	sizeOfArray=sizeOfArray+1;
	    }
	 public void removeElement( )
	 {
		 System.out.println("Enter index to be removed");
		 int index=in.nextInt();
		 if(count>0)
		 {
			 for(int i=index;i<count-1;i++)
			 {
				 array[i]=array[i+1];
			 }
			 array[count-1]=null;
			 count--;
			 
		 }
		 listProduct();
	 }
	 public void listProduct()
	 {
		 for(int i=0;i<sizeOfArray;i++)
		 {
			 System.out.println(array[i]);
		 }
	 }
	 public void serachProduct()
	 {
		 System.out.println("Please Enter Id to be searched");
		 int key=in.nextInt();
		 boolean isPresent=false;
		 for(int i=0;i<sizeOfArray;i++)
		 {
			 if(array[i].getId()==key)
			 {
				 System.out.println(array[i]);
				 isPresent=true;
				 break;
			 }
		 }
		 if(!isPresent)
		 {
			 System.out.println("Product not present");
		 }
		 
	 }
	 
		/*
		 * public void sort() { int n=array.length; Product temp=null;
		 * 
		 * for(int i=0;i<n;i++) { for(int j=1;j<(n-i);j++) {
		 * if(array[j-1].getId()>array[j].getId()) { temp=array[j-1];
		 * array[j-1]=array[j]; array[j]=temp; } } } }
		 */
		public   void merge(Product arr[],int beg,int end,int mid )
		{
	 
		  int i,j,k;
		  int n1=mid-beg+1;
		  int n2=end-mid;
		  
		  Product [] LeftArray =new Product[n1];

		  Product [] RightArray =new Product[n2];
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
			  if(LeftArray[i].getPrice()<=RightArray[j].getPrice())
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
		  
		 
		}
		
		public   void sort(Product [] arr,int beg,int end)
		{
			if(beg<end)
			{
				int mid=(beg+end)/2;
				sort(arr,beg,mid);
				sort(arr,mid+1,end);
				 merge(arr, beg, end, mid);
			}
		}
		
		public void callSort()
		{
			sort(array,0,array.length-1);
		}

}
