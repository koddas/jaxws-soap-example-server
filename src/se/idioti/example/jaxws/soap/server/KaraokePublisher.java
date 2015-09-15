package se.idioti.example.jaxws.soap.server;

import javax.xml.ws.Endpoint;

/**
 * This is the main server program.
 * 
 * @author "Johan Holmberg, Malmö university"
 * @since 1.0
 */
public class KaraokePublisher {
	public static void main(String[] args) {
		// This is where we publish all endpoints that we want to use. In our
		// case, we only have one.
		Endpoint.publish("http://localhost:9999/ws/song", new KaraokeImpl());
	}
}
