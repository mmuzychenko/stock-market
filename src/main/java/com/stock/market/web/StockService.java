package com.stock.market.web;

import com.stock.market.dao.InfoProvider;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.core.Response;

/**
 * Created by mmuzichenko on 10/16/2017.
 */

@RestController
public class StockService {

    private InfoProvider infoProvider = new InfoProvider();

    @CrossOrigin()
    @RequestMapping("/quotes")
    @POST
    public Response getStockQuotes() {
        return Response.ok(infoProvider.getSharesList()).build();
    }

    @CrossOrigin()
    @RequestMapping("/rates")
    @GET
    public Response getTotalRaits() {
        return Response.ok(infoProvider.getRaits()).build();
    }

}
