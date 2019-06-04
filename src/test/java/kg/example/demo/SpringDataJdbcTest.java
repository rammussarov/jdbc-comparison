package kg.example.demo;

import kg.example.demo.springdatajdbc.config.SpringDataJdbcConfig;
import kg.example.demo.springdatajdbc.dao.SpringDataJdbcUserRepository;
import kg.example.demo.springdatajdbc.entity.SdjUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
//@ContextConfiguration(classes = SpringDataJdbcConfig.class)
public class SpringDataJdbcTest {

    @Autowired
    private SpringDataJdbcUserRepository jdbcUserRepository;

    @Test
    public void countAll() {
        System.out.println("Counting all");
        System.out.println(jdbcUserRepository.countAll());
        assert jdbcUserRepository.countAll() == 2;
    }

    @Test
    public void findAll() {
        Iterable<SdjUser> users = jdbcUserRepository.findAll();
        users.forEach(e-> System.out.println(e));
        assert true;
    }
}
