package com.oliver.docker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloDocker {

    public static final Logger LOG = LoggerFactory.getLogger(HelloDocker.class);

    public static void main(String[] args) {
        System.out.println("Hello Docker!!");
        LOG.debug("Hello Docker LOG");
    }
}
