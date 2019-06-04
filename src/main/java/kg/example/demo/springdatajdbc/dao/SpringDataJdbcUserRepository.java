package kg.example.demo.springdatajdbc.dao;

import kg.example.demo.springdatajdbc.entity.SdjUser;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SpringDataJdbcUserRepository extends CrudRepository<SdjUser, Long> {

    @Query("select count(*) from public.user")
    public Integer countAll();

    @Query("select * from public.user")
    List<SdjUser> getAllUsers();

    @Modifying
    @Query("update public.user set date_time = current_timestamp where id = :id")
    void updateTimeById(@Param("id")Long id);
}
