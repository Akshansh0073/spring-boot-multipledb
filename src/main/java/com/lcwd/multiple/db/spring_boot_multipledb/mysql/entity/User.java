package com.lcwd.multiple.db.spring_boot_multipledb.mysql.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "multiple_users")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
}
