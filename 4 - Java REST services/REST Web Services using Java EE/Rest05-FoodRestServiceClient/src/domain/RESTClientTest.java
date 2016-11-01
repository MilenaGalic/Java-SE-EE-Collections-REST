/*package domain;

import static org.junit.Assert.assertTrue;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.junit.Test;

import utility.Utility;

public class RESTClientTest {
	
	@Test
	public void getAllTest() {
		// call the web service
		RESTClient client = new RESTClient();
		Response response = client.getAll(MediaType.APPLICATION_XML);
		
		
		Utility.printResponse(response);
		
		// test the response
		assertTrue(Utility.getStatusCode(response) == Utility.OK_STATUS);
		
	}

}
*/