package kg.example.demo.springdatajdbc.dao;

import kg.example.demo.springdatajdbc.entity.SdjUser;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataJdbcUserRepository extends CrudRepository<SdjUser, Long> {

    @Query("select count(id) from public.user")
    public int countAll();
}
