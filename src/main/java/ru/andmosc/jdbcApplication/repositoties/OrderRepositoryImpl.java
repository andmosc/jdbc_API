package ru.andmosc.jdbcApplication.repositoties;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

import static ru.andmosc.jdbcApplication.util.ReadScriptSql.read;

@Repository
public class OrderRepositoryImpl implements OrderRepository {
    private final static String SCRIPT_FILE = "select_product_name.sql";
    private final NamedParameterJdbcTemplate namedParameter;
    private final String selectProductNameSql;

    public OrderRepositoryImpl(NamedParameterJdbcTemplate namedParameter) {
        this.namedParameter = namedParameter;
        selectProductNameSql = read(SCRIPT_FILE);
    }

    public List<String> getProductName(String name) {
        MapSqlParameterSource in = new MapSqlParameterSource();
        in.addValue("name", name);
        return namedParameter.query(selectProductNameSql, in, (rs, rowNum) -> rs.getString("product_name"));
    }
}
