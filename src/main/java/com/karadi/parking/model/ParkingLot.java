package com.karadi.parking.model;

import java.util.LinkedHashSet;
import java.util.Set;

public class ParkingLot {

	private Integer size;
	private Set<Slot> slots;

	public ParkingLot(Integer size) {
		this.size = size;
		this.slots = new LinkedHashSet<Slot>(size);
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Set<Slot> getSlots() {
		return slots;
	}

	public void setSlots(Set<Slot> slots) {
		this.slots = slots;
	}

	@Override
	public String toString() {
		return "ParkingLot [size=" + size + ", slots=" + slots + "]";
	}

}
