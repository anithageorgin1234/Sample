package com.greatlearning.week5.practical;

import java.util.Scanner;

public class ECommerce {

	public static void main(String[] args) {
		String[] options = { "1-Add Prodcut", "2-Update Product", "3-Remove Prodcut", "4-List Product","5-Search Prodcut","6-Sort", "7-Exit" };
		Scanner in=new Scanner(System.in);
		ProductDAO productDao=new ProductDAO();
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

				productDao.updateProduct();
				break; 
			}
			case 3: {
				productDao.removeElement();
				break;
				 
			}
			case 4: {
				productDao.listProduct();
				break;
				 
			}
			case 5: {
				productDao.serachProduct();
				break;
				 
			}
			case 6: {
				productDao.callSort();
				break;
				 
			}
			case 7:
				break;
			}

		}
		
	}

}
