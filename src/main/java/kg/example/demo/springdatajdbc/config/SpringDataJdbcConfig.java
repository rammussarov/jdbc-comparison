package kg.example.demo.springdatajdbc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.data.jdbc.repository.config.JdbcConfiguration;

@Configuration
@EnableJdbcRepositories
public class SpringDataJdbcConfig extends JdbcConfiguration {


}
