package model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Cat {
    private String name;
    private int age;
    private List<Cat> children;
}
