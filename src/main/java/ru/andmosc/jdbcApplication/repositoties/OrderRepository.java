package ru.andmosc.jdbcApplication.repositoties;

import java.util.List;

public interface OrderRepository {
    List<String> getProductName(String name);
}
