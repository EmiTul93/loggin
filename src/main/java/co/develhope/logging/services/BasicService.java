package co.develhope.logging.services;

import co.develhope.logging.controllers.BasicController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class BasicService {

    Logger logger = LoggerFactory.getLogger(BasicController.class);

    @Autowired
    private Environment environment;

    public Integer doPower() {
        try {
            logger.debug("Calculating Power");
            return (int) Math.pow(Integer.parseInt(environment.getProperty("env1")),
                    Integer.parseInt(environment.getProperty("env2")));
        } finally {
            logger.debug("Power calculated");
        }
    }
}