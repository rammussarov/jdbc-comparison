package kg.example.demo.entity;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@ToString
public class User {

    private Long id;
    private String name, email;
}
