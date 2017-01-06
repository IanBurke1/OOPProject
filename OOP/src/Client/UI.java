package Client;

import java.util.Scanner;

public class UI {
	
	/*
	 * Method used to display the menu to the user and interact with.
	 */
	public void menu() {
		int option;
		//Scan in user input.
		Scanner scan = new Scanner(System.in);
		
		do{
			System.out.println("1. Connect to Server \n 2. Print File Listing \n 3. Download File \n 4. Quit");
			System.out.println();
			System.out.print("Type Option [1-4]>");
			option = scan.nextInt();
			if(option == 1){
				WebClient wc = new WebClient();
				wc.Client();
			}
			if(option == 2){
				
			}
			if(option == 3){
				
			}
			else if(option != 1 && option != 2 && option != 3 && option != 4) {
				System.out.println("Please enter the correct value. (1-4)");
			}
		}
		while(option != 4);
		scan.close();
	}

}
