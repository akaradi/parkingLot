package com.karadi.parking.task;

import static com.karadi.parking.constants.Constants.Command.CREATE_PARKING_LOT;
import static com.karadi.parking.constants.Constants.Command.EXIT;
import static com.karadi.parking.constants.Constants.Command.LEAVE;
import static com.karadi.parking.constants.Constants.Command.PARK;
import static com.karadi.parking.constants.Constants.Command.REGISTRATION_NUMBERS_FOR_CARS_WITH_COLOUR;
import static com.karadi.parking.constants.Constants.Command.SLOT_NUMBERS_FOR_CARS_WITH_COLOUR;
import static com.karadi.parking.constants.Constants.Command.SLOT_NUMBER_FOR_REGISTRATION_NUMBER;
import static com.karadi.parking.constants.Constants.Command.STATUS;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;

public class TaskFactory {

	private static TaskFactory instance;

	private static Supplier<Task> creationTask = () -> new CreateParkingLotTask();
	private static Supplier<Task> parkingTask = () -> new ParkTask();
	private static Supplier<Task> searchByColorTask = () -> new SearchByColourTask();
	private static Supplier<Task> searchByRegistrationNumberTask = () -> new SearchByRegistrationNumberTask();
	private static Supplier<Task> leaveTask = () -> new LeaveTask();
	private static Supplier<Task> statusTask = () -> new StatusTask();
	private static Supplier<Task> exitTask = () -> new ExitTask();

	private Map<String, Supplier<Task>> factoryMap = new HashMap<String, Supplier<Task>>();

	private TaskFactory() {

		factoryMap.put(CREATE_PARKING_LOT, creationTask);
		factoryMap.put(PARK, parkingTask);
		factoryMap.put(SLOT_NUMBERS_FOR_CARS_WITH_COLOUR, searchByColorTask);
		factoryMap.put(REGISTRATION_NUMBERS_FOR_CARS_WITH_COLOUR, searchByColorTask);
		factoryMap.put(SLOT_NUMBER_FOR_REGISTRATION_NUMBER, searchByRegistrationNumberTask);
		factoryMap.put(LEAVE, leaveTask);
		factoryMap.put(STATUS, statusTask);
		factoryMap.put(EXIT, exitTask);

	}

	public static TaskFactory getInstance() {
		if (Objects.isNull(instance)) {
			instance = new TaskFactory();
		}
		return instance;
	}

	public Task getTask(String command) throws Exception {

		Supplier<Task> taskSupplier = factoryMap.get(command.toUpperCase());

		if (Objects.isNull(taskSupplier)) {
			throw new Exception("Enter valid commands:" + factoryMap.keySet());
		}

		return taskSupplier.get();

	}

}
