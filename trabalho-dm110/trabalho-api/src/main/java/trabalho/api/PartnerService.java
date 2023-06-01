package trabalho.api;

import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/partner")
public interface PartnerService {

	@POST
	@Path("/partner")
	@Consumes(MediaType.APPLICATION_JSON)
	public void savePartner(PartnerTO partner);

	@GET
	@Path("/partners")
	@Produces(MediaType.APPLICATION_JSON)
	public List<PartnerTO> listAll();

}
