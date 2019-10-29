package com.karadi.parking.task;

import java.util.Objects;

import com.karadi.parking.CommandLine;
import com.karadi.parking.model.ParkingLot;

public class ExitTask extends Task {

	@Override
	public ParkingLot execute(String command, String[] args, ParkingLot parkingLot) {
		System.out.println("Exited!!");
		CommandLine.setShutdown(true);
		return null;
	}

	@Override
	public boolean validateParkingLot(ParkingLot parkingLot) throws Exception {
		if (!Objects.isNull(parkingLot)) {
			throw new Exception("Parking lot already created!!" + parkingLot);
		}
		return Objects.isNull(parkingLot);
	}

}
