package com.garrettestrin.sample.biz;

import com.garrettestrin.sample.api.ApiObjects.Sample;

public class SampleService {

    public Sample sample(String string){
        return new Sample(string);
    }
}
