package com.oko.OKO_Project.entity;

import com.oko.OKO_Project.enums.UnionistsType;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "union_members")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Unionists {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String title, text, description;

    @Enumerated(EnumType.STRING)
    UnionistsType unionistsType;
}
