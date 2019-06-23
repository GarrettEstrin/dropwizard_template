package com.garrettestrin.sample.app;

import com.garrettestrin.sample.api.SampleResource;
import com.garrettestrin.sample.biz.SampleService;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import lombok.val;

public class SampleApplication extends Application<SampleConfiguration> {

    @Override
    public String getName() {
        return "sample";
    }

    @Override
    public void initialize(Bootstrap<SampleConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(SampleConfiguration configuration,
                    Environment environment) {
        // SampleResource
        val sampleService = new SampleService();

        final SampleResource sampleResource = new SampleResource(sampleService);
        environment.jersey().register(sampleResource);
    }

}
