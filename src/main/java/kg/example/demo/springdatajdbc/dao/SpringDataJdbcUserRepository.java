package kg.example.demo.springdatajdbc.dao;

import kg.example.demo.springdatajdbc.entity.SdjUser;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface SpringDataJdbcUserRepository extends CrudRepository<SdjUser, Long> {

    @Query("select count(*) from public.user")
    public Integer countAll();
}
