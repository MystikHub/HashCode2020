import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BookScanning {

	public static void main(String[] args) {
		File dataset = new File("a_example.txt");
		Scanner fileReader;
		try {
			fileReader = new Scanner(dataset);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return;
		}
	}
}
