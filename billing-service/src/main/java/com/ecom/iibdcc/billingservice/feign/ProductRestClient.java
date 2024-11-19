package com.ecom.iibdcc.billingservice.feign;

import com.ecom.iibdcc.billingservice.model.Customer;
import com.ecom.iibdcc.billingservice.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "inventory-service")
public interface ProductRestClient {
    @GetMapping("/api/products/{id}")
    Product getProductById(@PathVariable("id") String id);

    @GetMapping("/api/products")
    PagedModel<Product> getAllProducts();
}
