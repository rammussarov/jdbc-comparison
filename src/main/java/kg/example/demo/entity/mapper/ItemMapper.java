package kg.example.demo.entity.mapper;

import kg.example.demo.entity.Item;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ItemMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
        Item item = new Item();
        item.setId(resultSet.getLong("id"));
        item.setName(resultSet.getString("name"));
        item.setCount(resultSet.getLong("count"));
        return item;
    }
}
