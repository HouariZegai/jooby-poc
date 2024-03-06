package com.houarizegai.joobypoc;

import org.jooby.Result;
import org.jooby.Results;
import org.jooby.mvc.GET;
import org.jooby.mvc.Path;

import javax.inject.Singleton;
import javax.servlet.http.HttpServlet;
import java.util.Collections;
import java.util.List;

@Singleton
@Path("/")
public class CustomPaymentServlet extends HttpServlet {

    @GET
    @Path("/pets")
    public Result pets() {
        List<Pet> pets = Collections.singletonList(new Pet("Jack", 2));
        return Results.ok(pets);
    }
}
