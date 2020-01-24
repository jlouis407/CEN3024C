import java.io.*;
import java.util.*;

public class FileReader {
	
	private Scanner file;
	
	public void openFile() {
		try {
			file = new Scanner(new File("input.txt"));
		}
		catch (Exception e){
			System.out.println("File not found.");
		}
	}
	
	public void readFile() {
		while(file.hasNext()) {
			String obj1 = file.next();
			String obj2 = file.next();
			String chc1 = file.next();
			String chc2 = file.next();
			String chc3 = file.next();
			String chc4 = file.next();
		}
	}
	
	public void closeFile() {
		file.close();
	}

}
