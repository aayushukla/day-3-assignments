package main;
public class Date {

	int date;
	int month;
	int year;

	public Date(int date,int month,int year)
	{
		this.date=date;
		this.month=month;
		this.year=year;
	}

	public String toString()
	{
		
		return date + "/"+ month +"/"+ year;
		
	}
	public boolean isSmaller(Date d)
	{
		if(this.date<d.date && this.month<=d.month && this.year<=d.year)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public int[] diff(Date d)
	{
		int arr[]= new int[3];
		arr[0]=this.date-d.date;
		arr[1]=this.month-d.month;
		arr[2]=this.year-d.year;

		return arr;
	}
}	



































