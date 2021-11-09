package com.tedblob.jackson.fieldname;

import java.io.OutputStreamWriter;
import java.io.Writer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tedblob.jackson.fieldname.models.Student;

@SpringBootApplication
public class JacksonFieldNameApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JacksonFieldNameApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Student student = new Student(834567, "Michael Jackson");
		ObjectMapper mapper = new ObjectMapper();
		
		Writer writer = new OutputStreamWriter(System.err);
		
		mapper.writeValue(writer, student);
		
		String json = "{\"id\":834567,\"name\":\"Michael Jackson\"}";
		System.out.println(mapper.readValue(json, Student.class));
			
	}

}
