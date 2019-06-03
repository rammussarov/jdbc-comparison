package kg.example.demo.springdatajdbc.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@AllArgsConstructor
@Getter @Setter
@Table("user")
public class SdjUser {

    @Id
    private Long id;

    @Column("name")
    private String name;

    @Column("mail")
    private String mail;
}
