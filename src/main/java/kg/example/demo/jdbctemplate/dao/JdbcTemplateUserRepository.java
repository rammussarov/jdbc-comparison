package kg.example.demo.jdbctemplate.dao;

import kg.example.demo.entity.User;
import kg.example.demo.entity.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class JdbcTemplateUserRepository {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public JdbcTemplateUserRepository(final DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public int countAll(){
        return jdbcTemplate.queryForObject("select count(*) from public.user", Integer.class);
    }

    public List<User> findAll() {
        UserMapper userMapper = new UserMapper();
        List<User> users = jdbcTemplate.query("select * from public.user", userMapper);
        return users;
    }
}
