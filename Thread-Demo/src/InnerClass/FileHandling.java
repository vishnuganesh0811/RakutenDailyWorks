package InnerClass;
import java.io.*;

public class FileHandling {
	public static void main(String[] args) throws IOException {
		readfile();
	}
	private static void readfile() throws IOException {
		FileReader reader = new FileReader("input.txt");
		BufferedReader bufferedreader = new BufferedReader(reader);
		String line=bufferedreader.readLine();
		System.out.println(line);
	}
	
	private void writefile(String file, String data) {
	    try {
	        File myObj = new File("filename.txt");
	        if (myObj.createNewFile()) {
	          System.out.println("File created: " + myObj.getName());
	        } else {
	          System.out.println("File already exists.");
	        }
	      } catch (IOException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }

		

	}
}
