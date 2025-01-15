package com.lcwd.multiple.db.spring_boot_multipledb;

import com.lcwd.multiple.db.spring_boot_multipledb.mongodb.Collections.Student;
import com.lcwd.multiple.db.spring_boot_multipledb.mongodb.Repository.StudentRepo;
import com.lcwd.multiple.db.spring_boot_multipledb.mysql.entity.User;
import com.lcwd.multiple.db.spring_boot_multipledb.mysql.repository.UserRepo;
import com.lcwd.multiple.db.spring_boot_multipledb.postgres.entity.College;
import com.lcwd.multiple.db.spring_boot_multipledb.postgres.repository.CollegeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMultipledbApplication implements CommandLineRunner {

	@Autowired
	private UserRepo userRepo;

	@Autowired
	private CollegeRepo collegeRepo;

	@Autowired
	private StudentRepo studentRepo;

	public static void main(String[] args) { SpringApplication.run(SpringBootMultipledbApplication.class, args);}

	@Override
	public void run(String... args) throws Exception {

		User admin = User.builder()
						.email("admin@gmail.com")
						.name("admin")
						.password("abcd")
						.build();
		User save = userRepo.save(admin);
		System.out.println("user is created: " + save.toString());

		College college = College.builder()
						.collegeName("Govt. college Ajmer")
				 		.collegeEmail("goeka@gmail.com")
						.collegePhone("234523").build();
		College save1 = collegeRepo.save(college);
		System.out.println("College is created: " + save1);

		Student student = Student.builder()
				.name("Akshansh")
				.email("akshansh@gmail.com")
				.password("1234")
				.build();

		Student save2 = studentRepo.save(student);
		System.out.println("Student is created: " + save2.toString());

	}
}
