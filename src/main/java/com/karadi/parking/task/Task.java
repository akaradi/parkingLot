package com.karadi.parking.task;

import java.util.Objects;

import com.karadi.parking.model.ParkingLot;

public abstract class Task {

	public ParkingLot run(String command, String[] args, ParkingLot parkingLot) throws Exception {
		if (validateParkingLot(parkingLot)) {
			parkingLot = execute(command, args, parkingLot);
		}
		return parkingLot;
	}

	public boolean validateParkingLot(ParkingLot parkingLot) throws Exception {
		Objects.requireNonNull(parkingLot, "Please create a parking lot");
		return Objects.nonNull(parkingLot);
	}

	public abstract ParkingLot execute(String command, String[] args, ParkingLot parkingLot);

}
