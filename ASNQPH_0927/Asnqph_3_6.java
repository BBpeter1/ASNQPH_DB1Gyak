package adatbgyak3;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Asnqph_3_6 implements Serializable{
	
	private static final long serailVersionUID= 1L;
	String rsz;
	String tipus;
	int ar;
	
	public Asnqph_3_6(String r, String t, int a)
	{
		this.rsz=r;
		this.tipus=t;
		this.ar=a;
	}

	public static void main(String[] args) {
		
		String sor;
		Asnqph_3_6[] autoim = { new Asnqph_3_6("R11", "Opel", 333), new Asnqph_3_6("R12", "Fiat", 233), new Asnqph_3_6("R14", "Skoda", 364)
		};
		
		try {
			ObjectOutputStream kifile = new ObjectOutputStream(
					new FileOutputStream("Autok.dat")
					);
			for (Asnqph_3_6 asnqph_3_6 : autoim) {
				kifile.writeObject(asnqph_3_6);
			}
			kifile.close();
		} catch(Exception e) {
			
			e.printStackTrace();
			System.out.println(" File nyitási hiba.");
		}
		System.out.println(" A mûvelet kész");
		
	}

}
