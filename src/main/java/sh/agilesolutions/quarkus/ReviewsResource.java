package sh.agilesolutions.quarkus;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/reviews")
public class ReviewsResource {

//	@Inject
//	@RestClient
//	private RatingsServiceClient ratingsService;

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getReviews() {
//		return String.format("Reviewed with rating %s", ratingsService.getRatings());
		return "reviews done";
	}
}