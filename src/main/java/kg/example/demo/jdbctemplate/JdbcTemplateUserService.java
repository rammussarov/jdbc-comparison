package kg.example.demo.jdbctemplate;

import kg.example.demo.entity.User;
import kg.example.demo.jdbctemplate.dao.JdbcTemplateItemRepository;
import kg.example.demo.jdbctemplate.dao.JdbcTemplateUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JdbcTemplateUserService {

    private final JdbcTemplateUserRepository jdbcTemplateUserRepository;
    private final JdbcTemplateItemRepository jdbcTemplateItemRepository;

    @Autowired
    public JdbcTemplateUserService(JdbcTemplateUserRepository jdbcTemplateUserRepository, JdbcTemplateItemRepository jdbcTemplateItemRepository) {
        this.jdbcTemplateUserRepository = jdbcTemplateUserRepository;
        this.jdbcTemplateItemRepository = jdbcTemplateItemRepository;
    }

    public int countAll() {
        return jdbcTemplateUserRepository.countAll();
    }

    public List<User> findAll() {
        List<User> users = jdbcTemplateUserRepository.findAll();
        for (User user : users) {
            user.setItems(jdbcTemplateItemRepository.findAllByUserId(user.getId()));
        }
        return users;
    }
}
