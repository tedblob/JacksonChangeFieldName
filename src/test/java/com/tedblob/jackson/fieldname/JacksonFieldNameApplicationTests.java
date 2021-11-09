package com.tedblob.jackson.fieldname;

import static org.hamcrest.CoreMatchers.containsString;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tedblob.jackson.fieldname.models.Student;

@SpringBootTest
class JacksonFieldNameApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void jsonProperty_FieldName_Validation() throws JsonProcessingException {
	    ObjectMapper mapper = new ObjectMapper();
	    Student student = new Student(2356, "Mike");

	    String studentAsStr = mapper.writeValueAsString(student);
	    
	    assert(studentAsStr.contains("name"));
	    assert(studentAsStr.contains("studentName"));
	}
}
