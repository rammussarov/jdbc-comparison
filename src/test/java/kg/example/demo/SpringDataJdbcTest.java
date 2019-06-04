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
import sun.nio.cs.ext.SJIS;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
//@ContextConfiguration(classes = SpringDataJdbcConfig.class)
public class SpringDataJdbcTest {

    @Autowired
    private SpringDataJdbcUserRepository jdbcUserRepository;

    @Test
    public void countAll() {
        System.out.println("User count = " + jdbcUserRepository.countAll());
        assert true;
    }

    @Test
    public void findAll() {
        Iterable<SdjUser> users = jdbcUserRepository.getAllUsers();
        users.forEach(e -> System.out.println(e));
        assert true;
    }

    @Test
    public void updateTime() {
        SdjUser user = jdbcUserRepository.findById(1L).get();
        System.out.println("Before: " + user);
        jdbcUserRepository.updateTimeById(user.getId());
        user = jdbcUserRepository.findById(1L).get();
        System.out.println("After" + user);
        assert true;
    }
}
