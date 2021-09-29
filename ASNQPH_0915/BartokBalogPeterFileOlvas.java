package bbpgyak3;
import java.io.File;  
import java.io.FileNotFoundException;  
import java.util.Scanner;

public class BartokBalogPeterFileOlvas {

	public static void main(String[] args) {
		
		try {
		      File obj = new File("fajl.txt");
		      Scanner Reader = new Scanner(obj);
		      while (Reader.hasNextLine()) {
		        String data = Reader.nextLine();
		        System.out.println(data);
		      }
		      Reader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("Hiba történt az olvasás során!");
		      e.printStackTrace();
		    }
		  }

		
}
