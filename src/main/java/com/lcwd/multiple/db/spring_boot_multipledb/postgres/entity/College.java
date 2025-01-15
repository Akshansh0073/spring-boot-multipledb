package com.lcwd.multiple.db.spring_boot_multipledb.postgres.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="multiple_college")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class College {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String collegeName;
    private String collegeEmail;
    private String collegePhone;

}
