package adatbgyak3;

import java.io.File;  
import java.io.FileNotFoundException;
import java.util.Scanner;


public class BBPFileOlvas {

	public static void main(String[] args) {
		
	
		int [] tall = new int [2];
		try {
				int i=0;
		      Scanner scanner = new Scanner(new File("bartokbalog.txt"));
		      while(scanner.hasNextInt())
		      {
		          tall[i++] = scanner.nextInt();
		      }
		    } catch (FileNotFoundException e) {
		      System.out.println("Hiba t�rt�nt az olvas�s sor�n!");
		     e.printStackTrace();
		    } 
		int db = 0;
		for (int i = 0; i < tall.length; i++) {
			db++;
		}
		System.out.println("Az adatok sz�ma: " + db );
		
		for (int i = 0; i < tall.length; i++) {
			System.out.println(tall[i]);
		}
		System.out.println("�sszeg�k: " + (tall[0]+ tall[1]));
		
	}
}