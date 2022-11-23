package com.tcs.log4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tcs.log4j.dao.ReportDao;
import com.tcs.log4j.service.MessageService;

@SpringBootApplication
public class Log4jApplication {

	public static void main(String[] args) {
		SpringApplication.run(Log4jApplication.class, args);
		
		ReportDao dao= new ReportDao();
		dao.getName(101);
		
		MessageService msg=new MessageService();
		msg.getWelcomeMsg();
		msg.getGreetMsg();
	}

}