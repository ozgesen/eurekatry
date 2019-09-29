package controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

 
//restful servis i�in entpointimizi belirtiyoruz.
@RestController
public class ProductController {
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN, MediaType.APPLICATION_XML })
	@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN, MediaType.APPLICATION_XML })
	public String testService() {
		
		//biraz �nce belirttimiz gibi ilk build etti�imizde
		//bu �ekilde edece�iz sonras�nda ise (return "Product Service 2";)
		//olarak build edece�iz.
		return "Product Service 1";
    }
 
}