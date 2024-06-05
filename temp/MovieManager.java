import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MovieManager 
{
	private static List<Movies> movies = new ArrayList<>();
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		while(true)
		{
		System.out.println("Options:");
            		System.out.println("1. Add movie");
            		System.out.println("2. View movie");
            		System.out.println("3. Modify movie details");
            		System.out.println("4. Delete movie details");
           		    System.out.println("5. Exit");
            		System.out.print("Enter your choice: ");
            		int choice = scan.nextInt();
            		switch(choice)
            		{
	            		case 1:
	                			add_Movie(scan);
	                			break;
	            		case 2:
	                			view_Movies();
	                			break;
	            		case 3:
	                			modify_Movie(scan);
	                			break;
	            		case 4:
	                			delete_Movie(scan);
	                			break;
	            		case 5:
	                			System.out.println("Exiting...");
	                			System.exit(0);
	            		default:
	                			System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            		}
	      }
	}
	private static void add_Movie(Scanner sc) 
	{
        		System.out.println("Enter Movie Details:");
       		    System.out.println("Title:");
        		String title = sc.next();
        		System.out.println("ReleaseYear:");
        		String releaseYear = sc.next();
        		System.out.println("Actor:");
        		String actor = sc.next();
        		System.out.println("Actress:");
        		String actress = sc.next();
        
        		Movies movie = new Movies(title, releaseYear, actor, actress);
        		movies.add(movie);
        		System.out.println("Movie Added Successfully");
    	}
	
	private static void view_Movies() 
	{
        		if(movies.isEmpty())
        		{
        			System.out.println("No movies Available");
        			return;
        		}
        		System.out.println("List of Movies:");
        		for(Movies movie : movies)
        		{
        			System.out.println("Title : "+movie.title+" | "+"Release Year : "+movie.releaseYear+" | "+"Actor : "+movie.actor+" | "+"Actress : "+movie.actress);
        		}
    	}

	
	private static void modify_Movie(Scanner sc) 
	{
        		System.out.println("Enter the title of the movie to modify:");
        		String title = sc.next();
        
        		for(Movies movie : movies)
        		{
        			if(movie.title.equalsIgnoreCase(title))
        			{

        				System.out.println("New Title:");
movie.title = sc.next();
                			System.out.println("New ReleaseYear:");
                			movie.releaseYear = sc.next();
                			System.out.println("New Actor:");
                			movie.actor = sc.next();
                			System.out.println("New Actress:");
                			movie.actress = sc.next();
                
                			System.out.println("Movie Details Modify Successfully...");
                			return;
        			}
        		}
        		System.out.println("Movie not found.");
    	}
	
	private static void delete_Movie(Scanner sc) 
	{
        		System.out.println("Enter the title of the movie to delete:");
        		String title = sc.next();
        
        		Iterator<Movies> iterator = movies.iterator();
        
        		while (iterator.hasNext()) {
            		Movies movie = iterator.next();
            		if (movie.title.equalsIgnoreCase(title)) {
                			iterator.remove();
                			System.out.println("Movie deleted successfully.");
                			return;
            		   }
        		}
        		System.out.println("Movie not found.");
    	}
}
