package com.karadi.parking.task;

import java.util.Objects;
import java.util.Set;

import com.karadi.parking.model.CarSlot;
import com.karadi.parking.model.HeavyVehicleSlot;
import com.karadi.parking.model.ParkingLot;
import com.karadi.parking.model.Slot;

public class CreateParkingLotTask extends Task {

	@Override
	public ParkingLot execute(String command, String[] args, ParkingLot parkingLot) {
		Integer size = Integer.parseInt(args[0]);
		parkingLot = new ParkingLot(size);
		createAlternateCarAndHeavyVehicleSlots(parkingLot);
		System.out.println("Parking Lot created with Slots: " + size);
		return parkingLot;
	}

	private void createAlternateCarAndHeavyVehicleSlots(ParkingLot parkingLot) {
		Set<Slot> slots = parkingLot.getSlots();
		for (int i = 1; i <= parkingLot.getSize(); i++) {
			if (i % 2 == 0) {
				slots.add(new CarSlot(i, "default", "default"));
			} else {
				slots.add(new HeavyVehicleSlot(i, "default", "default"));
			}
		}
	}

	@Override
	public boolean validateParkingLot(ParkingLot parkingLot) throws Exception {
		if (!Objects.isNull(parkingLot)) {
			throw new Exception("Parking lot already created!!" + parkingLot);
		}
		return Objects.isNull(parkingLot);
	}

}
