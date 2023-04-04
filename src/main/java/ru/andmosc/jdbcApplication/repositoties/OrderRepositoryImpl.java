package ru.andmosc.jdbcApplication.repositoties;

import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

import static ru.andmosc.jdbcApplication.util.ReadSqriptSql.read;

@Repository
@AllArgsConstructor
public class OrderRepositoryImpl implements OrderRepository {
    private final static String SCRIPT_FILE = "select_product_name.sql";
    NamedParameterJdbcTemplate namedParameter;

    public List<String> getProductName(String name) {
        String selectProductNameSql = read(SCRIPT_FILE);
        MapSqlParameterSource in = new MapSqlParameterSource();
        in.addValue("name", name);
        return namedParameter.query(selectProductNameSql, in, (rs, rowNum) -> rs.getString("product_name"));
    }
}
