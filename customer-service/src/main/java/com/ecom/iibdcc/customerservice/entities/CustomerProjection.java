package com.ecom.iibdcc.customerservice.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "all", types = Customer.class)
public interface CustomerProjection {
    String getFirstName();
    String getEmail();
}
