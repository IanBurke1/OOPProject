package Client;

/*
 * Runner Class gets the ball rolling!. It contains the Main method.
 */
public class Runner {

	public static void main(String[] args)throws Throwable {
		//Context object
		Context ctx = new Context();
		//Creating ContextParser object. 
		ContextParser cp = new ContextParser(ctx);
		//Calling the init method 
		cp.init();
		

		
		System.out.println(ctx);
		System.out.println();
		
		//UI contains the Menu for the user to interact.
		UI m = new UI();
		m.menu();
		
		
		
	

	}

}
