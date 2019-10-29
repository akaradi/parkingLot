package com.karadi.parking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ParkingLotSystemApplication {

	private static CommandLine commandLine;

	@Autowired
	public ParkingLotSystemApplication(CommandLine commandLine) {
		this.commandLine = commandLine;
	}

	public static void main(String[] args) {
		SpringApplication.run(ParkingLotSystemApplication.class, args);
		commandLine.show();
	}
}
