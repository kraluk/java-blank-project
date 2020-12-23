package com.company.application;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

final class Application {
    private static final Logger log = LogManager.getLogger(Application.class);

    void execute() {
        log.info("Application has been executed!");
    }
}
