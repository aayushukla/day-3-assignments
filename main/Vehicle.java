package main;

public class Vehicle {

	int currentSpeed;
	private double currentDirection;
	private String ownerName;
	static long vehicleIdentificationNUmber;
	private int vehicleId;
	public static final String TURN_LEFT="left";
	public static final String TURN_RIGHT="right";
	
	

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

	public int changeSpeed(int changeSpeedTo)
	{
		return changeSpeedTo;
	}
	
	public int stopSpeed(int ab)
	{
		return 0;
	}

	public double directionRotation(double degree,String leftOrRight)
	{
		if(leftOrRight==TURN_LEFT)
		{
			double afterRotation=this.currentDirection-degree;
			return afterRotation;
		}
		else if(leftOrRight==TURN_RIGHT)
		{
			double afterRotation=this.currentDirection+degree;
			return afterRotation;
		}
		else 
			return 0.0;
	}

	public String toString()
	{
		
		return this.currentSpeed +"||"+ this.currentDirection +"||"+ this.ownerName +"||"+ this.vehicleId;
		
	}
	

	
}	

	