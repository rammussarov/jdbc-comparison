package kg.example.demo.springdatajdbc.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Table("public.item")
public class SdjItem {

    @Id
    private Long id;

    @Column("name")
    private String name;

    @Column("count")
    private Long count;

    public SdjItem(Long id, String name, Long count) {
        this.id = id;
        this.name = name;
        this.count = count;
    }
}
