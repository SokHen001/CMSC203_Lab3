import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//create a new object of type Scanner
		//that reads from the keyboard
		Scanner keyboard = new Scanner(System.in);
		
		//Create a new movie object
		Movie info = new Movie();
		String repeat;
		do {
			
			//prompt the user to enter the title of a movie
			System.out.println("Enter the title of a movie: ");
			
			//Set the title in the movie object
			//Read in the line that the user types
			info.setTitle(keyboard.nextLine());
		
			//prompt user to enter the movie's rating
			System.out.println("Enter the movie's rating: ");
		
			//Set the rating in the movie object
			//Read in the line that the user types
			info.setRating(keyboard.nextLine());
			
			//prompt user to enter the number of tickets sold
			System.out.println("Enter the number of tickets" +
							" sold for this movie:");
			
			//Set the number of tickets sold in the movie object
			//Read in the integer that the user types
			info.setSoldTickets(keyboard.nextInt());
			
			//Print out the information using the movie’s toString method
			System.out.println(info.toString());
			
			//prompt user if they want to enter another movie
			System.out.println("Do you want to enter another?"
							+ " (Y or N) ");
			repeat = keyboard.next();
			keyboard.nextLine();
		
		} while(repeat.equalsIgnoreCase("Y"));
		
		System.out.println("Goodbye");
		System.exit(0);
		
	}

}
