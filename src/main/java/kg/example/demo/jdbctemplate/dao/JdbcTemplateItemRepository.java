package kg.example.demo.jdbctemplate.dao;

import kg.example.demo.entity.Item;
import kg.example.demo.entity.mapper.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class JdbcTemplateItemRepository {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public JdbcTemplateItemRepository(final DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<Item> findAllByUserId(Long userId) {
        ItemMapper itemMapper = new ItemMapper();
        List<Item> items = jdbcTemplate.query("select * from public.item where user_id=" + userId, itemMapper);
        return items;
    }
}
