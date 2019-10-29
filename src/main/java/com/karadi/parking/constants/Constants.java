package com.karadi.parking.constants;

public class Constants {

	public static class Command {
		public static final String CREATE_PARKING_LOT = "CREATE_PARKING_LOT";
		public static final String REGISTRATION_NUMBERS_FOR_CARS_WITH_COLOUR = "REGISTRATION_NUMBERS_FOR_CARS_WITH_COLOUR";
		public static final String SLOT_NUMBERS_FOR_CARS_WITH_COLOUR = "SLOT_NUMBERS_FOR_CARS_WITH_COLOUR";
		public static final String SLOT_NUMBER_FOR_REGISTRATION_NUMBER = "SLOT_NUMBER_FOR_REGISTRATION_NUMBER";
		public static final String EXIT = "EXIT";
		public static final String PARK = "PARK";
		public static final String LEAVE = "LEAVE";
		public static final String STATUS = "STATUS";

	}

	public static class VehicleSize {
		public static final Integer CAR_SIZE = 4;
		public static final Integer SUV_SIZE = 5;
		public static final Integer BUS_SIZE = 8;
		public static final Integer HEAVY_TRANSPORT_SIZE = 10;
	}
}
