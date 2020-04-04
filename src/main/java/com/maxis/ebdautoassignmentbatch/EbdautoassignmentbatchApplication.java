package com.maxis.ebdautoassignmentbatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class EbdautoassignmentbatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(EbdautoassignmentbatchApplication.class, args);
	}

}
