package de.sdo.demo.examples;

import java.util.ArrayList;
import java.util.List;
import org.instancio.Instancio;

import de.sdo.demo.domain.Product;
import jakarta.annotation.PostConstruct;
import jakarta.inject.Named;
import lombok.Getter;

@Named
@Getter
public class SimpleDataTableExampleController {
    private List<Product> products = new ArrayList<>();

    @PostConstruct
    public void init() {
        products = Instancio.ofList(Product.class).size(10).create();
    }

}
