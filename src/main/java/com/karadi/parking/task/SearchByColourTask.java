package com.karadi.parking.task;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.karadi.parking.constants.Constants;
import com.karadi.parking.model.ParkingLot;
import com.karadi.parking.model.Slot;

public class SearchByColourTask extends Task {

	Function<? super Slot, Object> mapByVehicleNumber = Slot::getVehicleNumber;
	Function<? super Slot, Object> mapBySlotNumber = Slot::getSlotNumber;

	private Map<String, Function<? super Slot, Object>> mapOfFunction = new HashMap<>();

	public SearchByColourTask() {
		mapOfFunction.put(Constants.Command.REGISTRATION_NUMBERS_FOR_CARS_WITH_COLOUR, mapByVehicleNumber);
		mapOfFunction.put(Constants.Command.SLOT_NUMBERS_FOR_CARS_WITH_COLOUR, mapBySlotNumber);
	}

	@Override
	public ParkingLot execute(String command, String[] args, ParkingLot parkingLot) {

		List<Object> result = parkingLot.getSlots().values().stream()
				.filter(slot -> slot.getColor().equalsIgnoreCase(args[0])).map(mapOfFunction.get(command.toUpperCase()))
				.collect(Collectors.toList());
		if (result.size() > 0) {
			System.out.println(result);
		} else {
			System.out.println("Not found");
		}
		return parkingLot;
	}

}
