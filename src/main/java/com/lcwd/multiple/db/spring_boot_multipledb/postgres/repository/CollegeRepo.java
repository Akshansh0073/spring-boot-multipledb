package com.lcwd.multiple.db.spring_boot_multipledb.postgres.repository;

import com.lcwd.multiple.db.spring_boot_multipledb.postgres.entity.College;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollegeRepo extends JpaRepository<College,Long> {
}
