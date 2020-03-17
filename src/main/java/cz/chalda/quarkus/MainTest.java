package cz.chalda.quarkus;

import cz.chalda.quarkus.cdi.AnnotationSecond;
import cz.chalda.quarkus.cdi.AnnotationWithInit;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class MainTest {
    @Inject
    private CDIBean bean;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return ": " + bean.getInfo();
    }
}