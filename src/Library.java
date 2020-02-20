import java.util.ArrayList;


public class Library {
	ArrayList<Book> Library = new ArrayList<Book>();
	//int setupTime;
	public int numberOfBooks;
	public int timeForSignUp;		//time in days 
	public int booksSent;		//books scanned/day
	
	public Library(int numOfBooks,int setupTime,int bookSent) {
			this.numberOfBooks = numOfBooks;
			this.timeForSignUp = setupTime;
			this.booksSent = bookSent;
	}
	
	public String toString() {
		return Library.toString();
	}
}
