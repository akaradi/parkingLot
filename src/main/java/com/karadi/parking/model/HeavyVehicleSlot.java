package com.karadi.parking.model;

import com.karadi.parking.constants.Constants;

public class HeavyVehicleSlot extends Slot {

	public HeavyVehicleSlot(Integer slotNumber, String carNumber, String color) {
		super(slotNumber, carNumber, color);
		setSlotType(Constants.VehicleType.HEAVY_TRANSPORT_TYPE);
	}

}
