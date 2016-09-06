package com.drop.hello.resource;

import com.google.common.base.Optional;

import com.codahale.metrics.annotation.Timed;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * ssajja 01-07-2016
 */
@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldResource {

    private static String DEFAULT_NAME = "User";

    @GET
    @Timed
    public Hello sayHello(@QueryParam("name") Optional<String> name) {
        String message = "Hello " + name.or(DEFAULT_NAME);
        Hello hello = new Hello();
        hello.setMessage(message);
        return hello;
    }

}
