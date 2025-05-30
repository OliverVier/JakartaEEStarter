package de.sdo.demo.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product implements Serializable {
    private final String productName;
    private final Long price;
    private final Date releaseDate;
    private final String description;
    private final String imageUrl;
    private final String category;
    private final String brand;
    private final String sku;
}
