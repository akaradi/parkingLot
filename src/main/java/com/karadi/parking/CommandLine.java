package com.karadi.parking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

import org.springframework.stereotype.Component;

import com.karadi.parking.model.ParkingLot;
import com.karadi.parking.task.Task;
import com.karadi.parking.task.TaskFactory;

@Component
public class CommandLine {

	ParkingLot parkingLot = null;

	private static boolean shutdown = false;

	public static void setShutdown(boolean shutdown) {
		CommandLine.shutdown = shutdown;
	}

	public void show() {

		while (!shutdown) {
			try {
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				String commandLine = reader.readLine();

				String[] commandAndArgs = commandLine.split(" ");
				String command = commandAndArgs[0];
				String[] args = Arrays.copyOfRange(commandAndArgs, 1, commandAndArgs.length);

				Task task = TaskFactory.getInstance().getTask(command);
				parkingLot = task.run(command, args, parkingLot);

			} catch (Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}

	}

}
