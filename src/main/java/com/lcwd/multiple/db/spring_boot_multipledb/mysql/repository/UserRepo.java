package com.lcwd.multiple.db.spring_boot_multipledb.mysql.repository;

import com.lcwd.multiple.db.spring_boot_multipledb.mysql.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {
}
