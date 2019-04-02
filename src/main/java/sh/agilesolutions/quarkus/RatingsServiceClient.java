package sh.agilesolutions.quarkus;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/ratings")
@RegisterRestClient
public interface RatingsServiceClient {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getRatings();
}