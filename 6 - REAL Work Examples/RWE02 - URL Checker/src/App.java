import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class App {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		HttpURLConnection connection = null;
		try {
			connection = (HttpURLConnection) new URL("http://www.googleee.org").openConnection();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		connection.setRequestMethod("HEAD");
		int responseCode = connection.getResponseCode();
		if (responseCode != 200) {
		    System.out.println("All is not good");
		}
		else {
			 System.out.println("All is good");
		}
		
	}

}
