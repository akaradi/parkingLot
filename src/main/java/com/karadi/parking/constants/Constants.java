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

	public static class VehicleType {
		public static final String CAR_TYPE = "car";
		public static final String HEAVY_TRANSPORT_TYPE = "hv";
	}
}
