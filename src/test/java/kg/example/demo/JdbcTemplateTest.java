package kg.example.demo;

import kg.example.demo.entity.User;
import kg.example.demo.jdbctemplate.JdbcTemplateUserService;
import kg.example.demo.jdbctemplate.dao.JdbcTemplateUserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JdbcTemplateTest {

    @Autowired
    private JdbcTemplateUserService jdbcTemplateUserService;

    @Test
    public void countAll() {
        int countAll = jdbcTemplateUserService.countAll();
        System.out.println("Total count" + countAll);
        assert true;
    }

    @Test
    public void findAll() {
        List<User> users = jdbcTemplateUserService.findAll();
        users.forEach(e -> System.out.println(e));
        assert true;
    }
}
