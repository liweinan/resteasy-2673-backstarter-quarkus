package org.acme.getting.started;


import org.jboss.resteasy.spi.HttpRequest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;


@Path("/hello")
public class GreetingResource {

    // https://github.com/quarkusio/quarkus/issues/4125
    // https://github.com/quarkusio/quarkus/pull/5581
    @Context
    private HttpRequest request;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "<><><>" + request;
    }
}
