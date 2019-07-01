package com.garrettestrin.sample.app;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import lombok.val;

public class SampleApplication extends Application<SampleConfiguration> {

    @Override
    public String getName() {
        return "Sample";
    }

    @Override
    public void initialize(Bootstrap<SampleConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(SampleConfiguration configuration,
                    Environment environment) {
        val deps = new DependencyManager(configuration, environment);
    }

}
