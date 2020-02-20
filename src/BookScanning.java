import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class BookScanning {

	public static void main(String[] args) {
		// Open the file
		File dataset = new File("a_example.txt");
		Scanner fileReader;
		try {
			fileReader = new Scanner(dataset);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return;
		}
		
		// Read our data
		int bookCount = fileReader.nextInt();
		int libraryCount = fileReader.nextInt();
		int daysForScanning = fileReader.nextInt();
		fileReader.nextLine();
		
		String bookScores = fileReader.nextLine();
		ArrayList<Book> allBooks = new ArrayList<Book>();
		
		Scanner bookScanner = new Scanner(bookScores);
		
		while(bookScanner.hasNextInt()) {
			int bookScore = bookScanner.nextInt();
			Book newBook = new Book(bookScore);
			allBooks.add(newBook);
		}
		
		// System.out.println("Books: " + allBooks.toString());
		
		for(int i = 0; i < libraryCount; i++) {
			// Populate the libraries here
		}
		
		// Problem logic
		
		bookScanner.close();
		fileReader.close();
	}
}
