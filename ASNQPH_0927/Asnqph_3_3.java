/**
 * 
 */
package adatbgyak3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

/**
 * @author Bartók-Balog Péter
 *
 */
public class Asnqph_3_3 {

	public static void main(String[] args) {
		
		System.out.println("Olvasson be szavakat az end szóig");
		String sor;
		String[] szavak;
		int sorid =0;
		try {
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw= null;
			
			while( 0 <= sorid) {
				sor=br.readLine();
			if(sorid==0)
			{
				bw= new BufferedWriter(new FileWriter(sor));
			} else {
				
				bw.write(sor);
				bw.newLine();
			}
			sorid= sorid +1;
			szavak= sor.split(" ");
			for (String sz : szavak) {
				System.out.println(sz + ":");
				if(sz.compareTo("end") == 0)
				{
					br.close();
					sorid=-1;
				}
			}
		}
			bw.close();
			System.out.println("A mûvelet kész.");
			
		}catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
}
