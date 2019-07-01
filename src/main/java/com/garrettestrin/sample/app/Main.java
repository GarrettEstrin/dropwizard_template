package com.garrettestrin.sample.app;

public class Main {
    public static void main(String[] args) throws Exception {
        // TODO: add properties file here
        if (args == null || args.length == 0) {
            args = new String[] { "server", "target/classes/sample.yml" };
        }

        new SampleApplication().run(args);
    }
}
