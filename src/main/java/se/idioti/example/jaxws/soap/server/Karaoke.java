package se.idioti.example.jaxws.soap.server;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 * This interface describes a karaoke-themed web service.
 * 
 * @author "Johan Holmberg, Malmö university"
 * @since 1.0
 */
@WebService // This lets Java know that we're building a web service
@SOAPBinding(style = Style.RPC)  // This lets Java know that we're using SOAP
public interface Karaoke {
	@WebMethod String getSongAsString(String song);
}
