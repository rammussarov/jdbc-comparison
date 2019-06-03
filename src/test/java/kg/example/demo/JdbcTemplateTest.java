package kg.example.demo;

import kg.example.demo.jdbctemplate.dao.JdbcTemplateUserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JdbcTemplateTest {

    @Autowired
    private JdbcTemplateUserRepository jdbcTemplateUserRepository;

    @Test
    public void countAll() {
        System.out.println("Counting all");
        System.out.println(jdbcTemplateUserRepository.countAll());
        assert jdbcTemplateUserRepository.countAll() == 2;
    }
}
