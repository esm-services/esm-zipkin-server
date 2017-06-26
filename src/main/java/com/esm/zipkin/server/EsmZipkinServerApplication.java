package com.esm.zipkin.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class EsmZipkinServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EsmZipkinServerApplication.class, args);
	}
}
