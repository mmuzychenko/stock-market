package com.stock.market.web;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.ws.rs.GET;
import javax.ws.rs.core.Response;

/**
 * Created by mmuzichenko on 10/24/2017.
 */

@RestController
public class HelloController {

    @CrossOrigin()
    @RequestMapping("/race")
    @GET
    public Response index() {
        return Response.ok("Hello from server!!!").build();
    }

}
