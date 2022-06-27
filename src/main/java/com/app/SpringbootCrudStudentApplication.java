package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import com.app.entity.Student;
import com.app.repo.StudentRepo;
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})

@SpringBootApplication
@ComponentScan(basePackages={"com.app.controller"})
public class SpringbootCrudStudentApplication implements CommandLineRunner{

	
	@Autowired
	private StudentRepo repo;

	
	

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCrudStudentApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		/*
		Student s1=new Student("Breno","Travessa Humaita","breno.r.pantoja@gmail.com");
		Student s2=new Student("Pantoja","Humaita","brenop86@gmail.com");
		Student s3=new Student("Ramos","Total Vile","brenopantoja@icloud.com");
		Student s4=new Student("Pompeu","Belem","olipmop@gmail.com");
		
		repo.save(s1);
		repo.save(s2);
		repo.save(s3);
		repo.save(s4);
*/		
	}

}
