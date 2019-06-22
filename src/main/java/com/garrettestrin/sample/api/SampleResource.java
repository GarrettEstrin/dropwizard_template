package com.garrettestrin.sample.api;

import com.garrettestrin.sample.api.ApiObjects.Sample;
import com.codahale.metrics.annotation.Timed;
import com.garrettestrin.sample.biz.SampleService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/sampleRootPath")
@Produces(MediaType.APPLICATION_JSON)
public class SampleResource {

    private SampleService sampleService;

    public SampleResource(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    @GET
    @Path("specificPath")
    @Timed
    public Sample sample(@QueryParam("name") String string) {
        return sampleService.sample(string);
    }
}