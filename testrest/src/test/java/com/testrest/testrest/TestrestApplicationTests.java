package com.testrest.testrest;

import com.testrest.testrest.model.Student;
import com.testrest.testrest.repository.StudentJPARepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class TestrestApplicationTests {

	@Autowired
	StudentJPARepository studentJPARepository;
	@Test
	void contextLoads() {
	}

	@Test
	public void testCreate(){
		Student stu = new Student();
		stu.setId(13L);
		stu.setName("Levin");
		stu.setSalary("5000");
		stu.setTeamName("Byte");
		studentJPARepository.save(stu);
		assertNotNull(studentJPARepository.findById(13L).get() );
		//assertEquals(expected:"Levin", studentJPARepository.findById(13L).getClass().getName(), message:"Matches");

	}


}
