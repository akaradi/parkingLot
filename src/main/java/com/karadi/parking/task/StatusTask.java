package com.karadi.parking.task;

import com.karadi.parking.model.ParkingLot;

public class StatusTask extends Task {

	@Override
	public ParkingLot execute(String command, String[] args, ParkingLot parkingLot) {
		parkingLot.getSlots().stream().filter(slot -> slot.isOccupied()).forEach(System.out::println);
		return parkingLot;
	}

}
