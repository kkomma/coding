package abc.interview.a.anotes;

public class AaaaReadThis {

	public static void main(String[] args) {
		
		System.out.println("read the class contents");

		//Below contains frequently asked array questions
		//http://javaconceptoftheday.com/java-array-interview-programs/
		
		//good on threads
		//http://javaconceptoftheday.com/threads-in-java/
		
		//28 mins core java and spring pdfs
		//https://drive.google.com/open?id=0B8KENIDghuHAR05fTGk4YUg0RUk
		//https://drive.google.com/file/d/0B8KENIDghuHANW1Hcy1TMFQ2Z3c/view?usp=sharing
	}

}


/*
@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
==============================================================
package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/")
public class RestControllerAPI {
	
	@RequestMapping(value = "user1", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
	public String createUser(
			//@RequestBody String requestData,
		    @RequestParam(required = false) String flag,
		    @RequestParam(required = false) String store,
		    @RequestHeader(value = "ApplicationId", required = false) String applicationId, // by required is true
		    @RequestHeader(value = "Authorization", required = false) String authorization				
			) throws JsonProcessingException {
		
		String js = new ObjectMapper().writeValueAsString("test user 1 created");
		return js;
		
	}
	
	@RequestMapping(value = "user2", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE}
	, method = { RequestMethod.GET })
    @ResponseStatus(HttpStatus.OK)
	public JsonNode createUser1(
			//@RequestBody String requestData,
		    @RequestParam(required = false) String flag,
		    @RequestParam(required = false) String store,
		    @RequestHeader(value = "ApplicationId", required = false) String applicationId, // by required is true
		    @RequestHeader(value = "Authorization", required = false) String authorization				
			) throws JsonProcessingException {
		
		JsonNode js = new ObjectMapper().valueToTree("test user 2 created");
		return js;
		
		
	}

}*/
