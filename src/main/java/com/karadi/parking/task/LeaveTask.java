package com.karadi.parking.task;

import java.util.Set;

import com.karadi.parking.model.ParkingLot;
import com.karadi.parking.model.Slot;

public class LeaveTask extends Task {

	@Override
	public ParkingLot execute(String command, String[] args, ParkingLot parkingLot) {
		Integer slotNumber = Integer.parseInt(args[0]);
		Set<Slot> slots = parkingLot.getSlots();
		Slot slot = slots.stream().filter(slo -> slo.getSlotNumber().equals(slotNumber)).findAny()
				.orElseThrow(() -> new RuntimeException(slotNumber + " is not allocated!!"));
		slot.setColor(null);
		slot.setOccupied(false);
		System.out.println("Slot Number " + slotNumber + " is free");
		return parkingLot;
	}

}
