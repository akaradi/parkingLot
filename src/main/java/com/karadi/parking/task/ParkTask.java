package com.karadi.parking.task;

import java.util.Objects;
import java.util.Set;

import com.karadi.parking.model.ParkingLot;
import com.karadi.parking.model.Slot;

public class ParkTask extends Task {

	@Override
	public ParkingLot execute(String command, String[] args, ParkingLot parkingLot) {
		String slotType = args[2];
		if (!isSlotAvailable(parkingLot, slotType)) {
			System.out.println("Parking Lot is full");
			return parkingLot;
		}
		String vehicleNumber = args[0];
		String color = args[1];

		Slot slot = getSlotNumber(parkingLot.getSlots(), slotType);
		slot.setVehicleNumber(vehicleNumber);
		slot.setColor(color);
		slot.setOccupied(true);
		System.out.println("Allocated slot number: " + (slot.getSlotNumber()));
		return parkingLot;
	}

	private Slot getSlotNumber(Set<Slot> slots, String slotType) {
		for (Slot slot : slots) {
			if (slot.getSlotType().equals(slotType) && !slot.isOccupied()) {
				return slot;
			}
		}
		System.out.println("Allocation failed, Please provide valid slot type.");
		return null;

	}

	private boolean isSlotAvailable(ParkingLot parkingLot, String slotType) {
		return parkingLot.getSlots().stream()
				.anyMatch(slot -> slot.getSlotType().equals(slotType) && !slot.isOccupied());
	}

}
