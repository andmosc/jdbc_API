package ru.andmosc.jdbcApplication.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.andmosc.jdbcApplication.services.OrderServicesImpl;

@RestController
@RequestMapping("/products")
@AllArgsConstructor
public class OrderController {
    private OrderServicesImpl orderServices;

    @GetMapping("/fetch-product")
    public String getProductName(@RequestParam(value = "name") String name) {
        return orderServices.getProductName(name);
    }
}
