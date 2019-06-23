package com.garrettestrin.sample.api.ApiObjects;

import lombok.AllArgsConstructor;
import com.fasterxml.jackson.annotation.JsonProperty;

@AllArgsConstructor
public class Sample {
    @JsonProperty
    private String string;
}