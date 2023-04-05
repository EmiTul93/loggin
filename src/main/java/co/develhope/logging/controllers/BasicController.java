package co.develhope.logging.controllers;

import co.develhope.logging.services.BasicService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class BasicController {

    Logger logger = LoggerFactory.getLogger(BasicController.class);

    @Autowired
    private BasicService basicService;

    @GetMapping("/")
    public void welcomeMsg() {
        logger.info("Welcome Message ");
    }

    @GetMapping("/exp")
    public Integer doExp() {
        return basicService.doPower();
    }

    @GetMapping("/get-errors")
    public void error() {
        logger.error("Error");
    }

    @GetMapping("/debug")
    public void debug() {
        logger.debug("Debug Logging");
    }

    @GetMapping("/info")
    public void info() {
        logger.info("Logging");
    }

}
