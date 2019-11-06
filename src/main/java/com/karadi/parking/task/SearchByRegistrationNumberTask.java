package com.karadi.parking.task;

import java.util.List;
import java.util.stream.Collectors;

import com.karadi.parking.model.ParkingLot;

public class SearchByRegistrationNumberTask extends Task {

	@Override
	public ParkingLot execute(String command, String[] args, ParkingLot parkingLot) {
		List<Integer> result = parkingLot.getSlots().stream()
				.filter(slot -> slot.getVehicleNumber().equalsIgnoreCase(args[0])).map(slot -> slot.getSlotNumber())
				.collect(Collectors.toList());
		if (result.size() > 0) {
			System.out.println(result);
		} else {
			System.out.println("Not found");
		}
		return parkingLot;
	}

}
