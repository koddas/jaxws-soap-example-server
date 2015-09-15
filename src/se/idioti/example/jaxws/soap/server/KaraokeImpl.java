package se.idioti.example.jaxws.soap.server;

import javax.jws.WebService;

/**
 * This class implements the karaoke web service.
 * 
 * @author "Johan Holmberg, Malmö university"
 * @since 1.0
 */
@WebService(endpointInterface = "se.idioti.example.jaxws.soap.server.Karaoke")
public class KaraokeImpl implements Karaoke {

	@Override
	public String getSongAsString(String song) {
		return "Let's all sing along! You'll sing: " + song;
	}

}
