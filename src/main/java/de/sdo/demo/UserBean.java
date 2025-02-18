package de.sdo.demo;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Named
@SessionScoped
public class UserBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String greeting;

    public String greet() {
        if (StringUtils.isNotBlank(name)) {
            greeting = "Hello, ".concat(name);
        } else {
            greeting = "Hello World";
        }
        return null;
    }
}
