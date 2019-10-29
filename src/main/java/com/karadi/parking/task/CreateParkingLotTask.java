package com.karadi.parking.task;

import java.util.Objects;

import com.karadi.parking.model.ParkingLot;

public class CreateParkingLotTask extends Task {

	@Override
	public ParkingLot execute(String command, String[] args, ParkingLot parkingLot) {
		Integer size = Integer.parseInt(args[0]);
		parkingLot = new ParkingLot(size);
		System.out.println("Parking Lot created with Slots: " + size);
		return parkingLot;
	}

	@Override
	public boolean validateParkingLot(ParkingLot parkingLot) throws Exception {
		if (!Objects.isNull(parkingLot)) {
			throw new Exception("Parking lot already created!!" + parkingLot);
		}
		return Objects.isNull(parkingLot);
	}

}
