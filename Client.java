package Client;

import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		final String request = "GET /characters.txt HTTP/1.1\n\n"; //The message to send to the server
		
		//Variables
		int option;
		Scanner scan = new Scanner(System.in);
		do
		{	
			System.out.println("1. Connect to Server \n 2. Print File Listing \n 3. Download File \n 4. Quit");
			System.out.println();
			System.out.print("Type Option [1-4]>");
			option = scan.nextInt();
		
		}
		while(option !=4);
		scan.close();
		
		if(option==1){
			try{ 
				Socket s = new Socket("localhost", 8080); //Connect to server
				//Serialise / marshal a request to the server
				ObjectOutputStream out = new ObjectOutputStream(s.getOutputStream());
				out.writeObject(request); //Serialise
				out.flush(); //Ensure all data sent by flushing buffers
			}catch(Exception e) {
				
			}//Catch end
		}//If end
	}//Main end
}//Class end
