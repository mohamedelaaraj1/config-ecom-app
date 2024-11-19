package com.ecom.iibdcc.customerservice.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "phone", types = Customer.class)
public interface CustomerProjectionPhone {
    String getPhone();
}
