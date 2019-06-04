package kg.example.demo;

import kg.example.demo.entity.User;
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
    private JdbcTemplateUserRepository jdbcTemplateUserRepository;

    @Test
    public void countAll() {
        System.out.println("Counting all");
        int countAll = jdbcTemplateUserRepository.countAll();
        System.out.println(countAll);
        assert countAll == 2;
    }

    @Test
    public void findAll() {
        List<User> users = jdbcTemplateUserRepository.findAll();
        users.forEach(e -> System.out.println(e));
        assert true;
    }
}
