package Client;

import java.util.Scanner;

public class UI {
	
	public void menu() {
		int option;
		Scanner scan = new Scanner(System.in);
		
		do{
			System.out.println("1. Connect to Server \n 2. Print File Listing \n 3. Download File \n 4. Quit");
			System.out.println();
			System.out.print("Type Option [1-4]>");
			option = scan.nextInt();
			if(option == 1){
				System.out.println("Connect");
			}
			else {
				System.out.println("Error");
			}
		}
		while(option != 4);
		scan.close();
	}

}
