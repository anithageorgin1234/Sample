package com.greatlearning.linkedlist;

import java.util.Scanner;

import com.greatlearning.week5.practical.ProductDAO;

public class ProductMain {

	public static void main(String[] args) {
		String[] options = { "1-Add Prodcut", "2-Update Product", "3-Remove Prodcut", "4-Search Product", "5-Exit" };
		Scanner in=new Scanner(System.in);
		ProductListDAO productDao=new ProductListDAO();
		int option = 1;
		while (option != 5) {
			for (String optiondet : options) {
				System.out.println(optiondet);

			}

			System.out.println("Enter Option: ");

			option = in.nextInt();

			switch (option) {
			case 1: {

				productDao.addProduct();
				break;
			}
			case 2: {
                 productDao.update();
			 
				break; 
			}
			case 3: {
				 productDao.delete();
				break;
				 
			}
			case 4: {
				productDao.printList();
				break;
				 
			}
			case 5:
				break;
			}

		}
		
	}

}
