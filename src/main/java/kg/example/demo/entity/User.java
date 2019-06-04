package kg.example.demo.entity;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@ToString
public class User {

    private Long id;
    private String name, email;
    private List<Item> items;
}
