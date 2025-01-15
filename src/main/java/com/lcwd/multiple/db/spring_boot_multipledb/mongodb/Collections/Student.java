package com.lcwd.multiple.db.spring_boot_multipledb.mongodb.Collections;

import jakarta.persistence.Id;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="multiple_student")
@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    private String id;
    private String name;
    private String email;
    private String password;
}
