package kg.example.demo;

import kg.example.demo.springdatajdbc.dao.SpringDataJdbcUserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringDataJdbcTest {

    @Autowired
    private SpringDataJdbcUserRepository jdbcUserRepository;

    @Test
    public void countAll() {
        System.out.println("Counting all");
        System.out.println(jdbcUserRepository.countAll());
        assert jdbcUserRepository.countAll() == 2;
    }
}
