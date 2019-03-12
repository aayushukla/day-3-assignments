package main;

public class Vehicle {

	int currentSpeed;
	private double currentDirection;
	private String ownerName;
	static long vehicleIdentificationNUmber;
	private int vehicleId;
	

	public Vehicle()
	{
	}

	public Vehicle(int currentSpeed,double currentDirection,String ownerName,int vehicleId)
	{
		this.currentSpeed=currentSpeed;
		this.currentDirection=currentDirection;
		this.ownerName=ownerName;
		this.vehicleId=vehicleId;
	}
	
	//getter setter for speed
	public void setCurrentSpeed(int currentSpeed)
	{
		this.currentSpeed=currentSpeed;
	}

	public int getCurrentSpeed()
	{
		return currentSpeed;
	}

	//getter setter for direction
	public void setCurrentDirection(double currentDirection)
	{
		this.currentDirection=currentDirection;
	}

	public double getCurrentDirection()
	{
		return currentDirection;
	}

	//getter setter for owner name
	public void setOwnerName(String ownerName)
	{
		this.ownerName=ownerName;
	}

	public String getOwnerName()
	{
		return ownerName;
	}

	//getter setter for vehicle id
	public void setVehicleId(int vehicleId)
	{
		this.vehicleId=vehicleId;
	}

	public int getVehicleId()
	{
		return vehicleId;
	}

	public int changeSpeed(int a)
	{
		return a+20;
	}
	
	public int stopSpeed(int ab)
	{
		return 0;
	}

	
}	

	