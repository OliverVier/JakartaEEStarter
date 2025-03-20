package de.sdo.demo;

import java.io.Serial;
import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Named
@RequestScoped
public class GreeterBean implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private Logger logger;

    private String name;
    private String greeting;

    @Inject
    public GreeterBean(Logger logger) {
        this.logger = logger;
    }

    public String greet() {
        logger.info("Greeting user '{}'", name);
        if (StringUtils.isNotBlank(name)) {
            greeting = "Hello, ".concat(name);
        } else {
            greeting = "Hello World";
        }
        return null;
    }
}
