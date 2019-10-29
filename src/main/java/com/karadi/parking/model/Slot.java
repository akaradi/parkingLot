package com.karadi.parking.model;

public abstract class Slot {

	private Integer slotNumber;
	private String vehicleNumber;
	private String color;
	private Integer size;

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getSlotNumber() {
		return slotNumber;
	}

	public void setSlotNumber(Integer slotNumber) {
		this.slotNumber = slotNumber;
	}

	public Slot(Integer slotNumber, String vehicleNumber, String color) {
		super();
		this.slotNumber = slotNumber;
		this.vehicleNumber = vehicleNumber;
		this.color = color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((vehicleNumber == null) ? 0 : vehicleNumber.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((slotNumber == null) ? 0 : slotNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Slot other = (Slot) obj;
		if (vehicleNumber == null) {
			if (other.vehicleNumber != null)
				return false;
		} else if (!vehicleNumber.equals(other.vehicleNumber))
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (slotNumber == null) {
			if (other.slotNumber != null)
				return false;
		} else if (!slotNumber.equals(other.slotNumber))
			return false;
		return true;
	}

	public Integer getSize() {
		return size;
	}

	protected void setSize(Integer size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Slot [slotNumber=" + slotNumber + ", vehicleNumber=" + vehicleNumber + ", color=" + color + "]";
	}

}
