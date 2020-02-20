import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class BookScanning {

	public static void main(String[] args) {
		// Open the file
		File dataset = new File("f_libraries_of_the_world.txt");
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
		
		// Read the library data into our java classes
		Scanner libraryInfoScanner, libraryBookScanner;
		ArrayList<Library> allLibraries = new ArrayList<Library>();
		for(int i = 0; i < libraryCount; i++) {
			// Populate the libraries here
			libraryInfoScanner = new Scanner(fileReader.nextLine());
			libraryBookScanner = new Scanner(fileReader.nextLine());

			int libraryBookCount = libraryInfoScanner.nextInt();
			int librarySignupDuration = libraryInfoScanner.nextInt();
			int libraryBooksShippablePerDay = libraryInfoScanner.nextInt();
			
			Library newLibrary = new Library(libraryBookCount, librarySignupDuration, libraryBooksShippablePerDay);
			
			ArrayList<Book> libraryBooks = new ArrayList<Book>();
			for(int j = 0; j < libraryBookCount; j++) {
				int bookId = libraryBookScanner.nextInt();
				Book newBook = new Book(bookId);
				libraryBooks.add(newBook);
			}
			newLibrary.Library = libraryBooks;
			allLibraries.add(newLibrary);
		}
		
		// Problem logic
		
		
		bookScanner.close();
		fileReader.close();
	}
}
