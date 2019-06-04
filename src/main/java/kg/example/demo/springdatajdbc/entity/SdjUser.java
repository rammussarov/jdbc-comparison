package kg.example.demo.springdatajdbc.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter @Setter
@ToString
@Table("public.user")
public class SdjUser {

    @Id
    private Long id;

    @Column("name")
    private String name;

    @Column("mail")
    private String mail;

    @Column("date_time")
    private LocalDateTime dateTime;

    public SdjUser(Long id, String name, String mail) {
        this.id = id;
        this.name = name;
        this.mail = mail;
    }

    @Column("user_id")
    private Set<SdjItem> items = new HashSet<>();
}
