@ApplicationPath("/trivia")
@Path("")
public class TriviaApp extends Application {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getDirectory(@Context UriInfo uri) {
        Link selfLink = Link.fromUri(uri.getBaseUri())
             .rel("self").type(MediaType.APPLICATION_JSON)
             .build();
        Link questionsLink = Link.fromUri(uri.getBaseUri() + "questions")
             .rel("questions").type(MediaType.APPLICATION_JSON)
             .build();
        return Response.ok()
             .lastModified(new Date())
             .location(uri.getRequestUri())
             .links(selfLink, questionsLink)
             .build();
    }
}
