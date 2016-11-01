package domain;

import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

public class RESTClient {

	// REST Service Constants
	private static final String REST_URL = "http://localhost/Rest04-FoodRestServiceProject/rs";
	private static final int SERVER_PORT = 8080;
	private static final String PATH = "foods";

	// ivars
	private WebTarget target;

	/**
	 * Setup the connection.
	 */
	public RESTClient() {
		URI uri;
		Client client;

		// create the URL
		uri = UriBuilder.fromUri(REST_URL)
				.port(SERVER_PORT)
				.build();
		
		// create a client
		client = ClientBuilder.newClient();
		
		/**
		 * Trough a rest of a code, we'll use target
		 */
		target = client.target(uri)
				.path(PATH);
	}
	
	public Response getAll(String mediaType) {
		return target.request(mediaType).get();
	}

}
