package io.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static Logger LOG = LoggerFactory.getLogger(Main.class.getName());

    public static void main(String[] args) {

        LOG.trace("Trace message.");
        LOG.debug("Debug message.");
        LOG.info("Info message.");
        LOG.warn("Warning message.");
        LOG.error("Error message.");

    }
}
