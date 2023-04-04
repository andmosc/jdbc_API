package ru.andmosc.jdbcApplication.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.andmosc.jdbcApplication.repositoties.OrderRepositoryImpl;

@Service
@AllArgsConstructor
public class OrderServicesImpl implements OrderServices{
    private final OrderRepositoryImpl orderRepository;

    @Override
    public String getProductName(String name) {
        return String.join(",", orderRepository.getProductName(name));
    }
}
