package adatbgyak3;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Asnqph_3_7 {

	public static void main(String[] args) {
		
		Asnqph_3_6 ma;
		
		try {
			
			File fn = new File("Autok.dat");
			if(fn.exists())
			{
				ObjectInputStream kifile = new ObjectInputStream( new FileInputStream ( "Autok.dat"));
				
				try {
					while(true)
					{
						ma = (Asnqph_3_6) kifile.readObject();
						if(300 > ma.ar)
						{
							System.out.println("rendszam: " + ma.rsz);
						}
					}
				} catch(EOFException ee)
				{
					ma = null;
				}
				kifile.close();
			}
			
		} catch(Exception ee)
		{
			ee.printStackTrace();
			System.out.println("File nyitási hiba.");
		}
		System.out.println("A mûvelet kész.");
	}

}
