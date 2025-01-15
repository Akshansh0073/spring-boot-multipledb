package com.lcwd.multiple.db.spring_boot_multipledb.mongodb.Repository;

import com.lcwd.multiple.db.spring_boot_multipledb.mongodb.Collections.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepo extends MongoRepository<Student, String> {
}
