import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Application {
	public static void main(String[] args) {
		
		try {
	         URL url = new URL("http://cdp.aidrs.org/CRL/");
	         URLConnection conn = url.openConnection();
	         InputStream inputStream = conn.getInputStream();
	         BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
	         
	         DateFormat dateFormat = new SimpleDateFormat("M/d/yyyy");
	         Date date = new Date();

	         Calendar cal = Calendar.getInstance();
	         cal.add(Calendar.DATE, -1);
	         
	         String datumCRLliste = dateFormat.format(cal.getTime());
	         System.out.println("Datum CRL liste koji se provjerava = "+ datumCRLliste);
	         
	         String line = null;
	         Boolean CRLlistaAktivna = false;
	         while ((line = reader.readLine()) != null) {
	        	 System.out.println(line.contains(datumCRLliste));
	               if (line.contains(datumCRLliste)) {
	            	   
	            	   CRLlistaAktivna = true; break;
	               }
	            }
	         
	         if (CRLlistaAktivna) { 
	        	 System.out.println("CRL lista je aktivna."); }
	         else { 
	        	 // dio skripte koji salje EMAIL na odredjenu adresu...
	        	 System.out.println("CRL lista nije aktivna."); 
	         
	         }
	         
	         inputStream.close();
	     } catch (IOException ex) {
	         ex.printStackTrace();
	     }
	 } 
}
