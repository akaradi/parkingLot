package com.karadi.parking.model;

import com.karadi.parking.constants.Constants;

public class CarSlot extends Slot {

	public CarSlot(Integer slotNumber, String carNumber, String color) {
		super(slotNumber, carNumber, color);
		setSize(Constants.VehicleSize.CAR_SIZE);
	}

}
