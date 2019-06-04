package kg.example.demo.springdatajdbc.dao;

import kg.example.demo.springdatajdbc.entity.SdjItem;
import org.springframework.data.repository.CrudRepository;

public interface SpringDataJdbcItemRepository extends CrudRepository<SdjItem, Long> {

}
