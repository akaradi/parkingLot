package com.karadi.parking.task;

import java.util.Map;

import com.karadi.parking.model.ParkingLot;
import com.karadi.parking.model.Slot;

public class LeaveTask extends Task {

	@Override
	public ParkingLot execute(String command, String[] args, ParkingLot parkingLot) {
		Integer slotNumber = Integer.parseInt(args[0]);
		Map<Integer, Slot> slots = parkingLot.getSlots();
		if (slots.size() < slotNumber || !slots.containsKey(slotNumber)) {
			System.out.println(slotNumber + " is not allocated!!");
			return parkingLot;
		}
		parkingLot.getSlots().put(slotNumber, null);
		System.out.println("Slot Number " + slotNumber + " is free");
		return parkingLot;
	}

}
