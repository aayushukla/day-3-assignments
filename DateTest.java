class Date {

	private int date;
	private int month;
	private int year;

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

}


class DateTest {

	public static void main(String[] args)
	{
		Date obj=new Date(06,10,1996);
		Date obj2=new Date(06,10,2016);

		System.out.println(obj);
		
	
	}


}
































