package com.karadi.parking.task;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

import com.karadi.parking.model.CarSlot;
import com.karadi.parking.model.ParkingLot;
import com.karadi.parking.model.Slot;

public class ParkTask extends Task {

	@Override
	public ParkingLot execute(String command, String[] args, ParkingLot parkingLot) {
		if (!isSlotAvailable(parkingLot)) {
			System.out.println("Parking Lot is full");
			return parkingLot;
		}
		Integer slotNumber = getSlotNumber(parkingLot.getSlots());
		Slot slot = new CarSlot(slotNumber, args[0], args[1]);
		parkingLot.getSlots().put(slotNumber, slot);
		System.out.println("Allocated slot number: " + (slotNumber));
		return parkingLot;
	}

	private Integer getSlotNumber(Map<Integer, Slot> slots) {
		Set<Entry<Integer, Slot>> entries = slots.entrySet();
		for (Entry<Integer, Slot> e : entries) {
			if (Objects.isNull(e.getValue())) {
				return e.getKey();
			}
		}
		return slots.size() + 1;
	}

	private boolean isSlotAvailable(ParkingLot parkingLot) {
		return parkingLot.getSize() > parkingLot.getSlots().size() || parkingLot.getSlots().values().contains(null);
	}

}
