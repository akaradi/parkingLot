package com.karadi.parking.model;

import java.util.LinkedHashMap;
import java.util.Map;

public class ParkingLot {

	private Integer size;
	private Map<Integer, Slot> slots;

	public ParkingLot(Integer size) {
		this.size = size;
		this.slots = new LinkedHashMap<Integer, Slot>(size);
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Map<Integer, Slot> getSlots() {
		return slots;
	}

	public void setSlots(Map<Integer, Slot> slots) {
		this.slots = slots;
	}

	@Override
	public String toString() {
		return "ParkingLot [size=" + size + ", slots=" + slots + "]";
	}

}
