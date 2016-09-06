package com.drop.hello.application;

import com.drop.hello.conf.HelloWorldConfiguration;
import com.drop.hello.resource.HelloWorldResource;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

/**
 * ssajja 01-07-2016
 */
public class HelloWorldApplication extends Application<HelloWorldConfiguration> {

    public static void main(String[] args) throws Exception {
        new HelloWorldApplication().run(args);
    }

    public void run(HelloWorldConfiguration configuration, Environment environment) throws Exception {
        HelloWorldResource resource = new HelloWorldResource();
        environment.jersey().register(resource);
    }

}
