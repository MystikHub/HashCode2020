package googleHashCode;
import java.util.ArrayList;


public class Library {
	ArrayList<Books> Library = new ArrayList();
	//int setupTime;
	public int numberOfBooks;
	public int timeForSignUp;		//time in days 
	public int booksSent;		//books scanned/day
	
	public Library(int numOfBooks,int setupTime,int bookSent) {
			this.numberOfBooks = numOfBooks;
			this.timeForSignUp = setupTime;
			this.booksSent = bookSent;
	}
	
	
}
