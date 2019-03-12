package main;

public class Triangle {
	
	int s1,s2,s3;

	public Triangle(int s1,int s2,int s3)
	{
		this.s1=s1;
		this.s2=s2;
		this.s3=s3;
	}
	
	public boolean isRight() {
		if(s1>s2 && s1>s3)
		{
			int hypo=s1;
			int base=s2;
			int perpendicular=s3;

			if(hypo*hypo==perpendicular*perpendicular+base*base)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		else if(s2>s1 && s2>s3)
		{
			int hypo=s2;
			int base=s1;
			int perpendicular=s3;

			if(hypo*hypo==perpendicular*perpendicular+base*base)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	
		else if(s3>s2 && s3>s2)
		{
			int hypo=s3;
			int base=s2;
			int perpendicular=s1;

			if(hypo*hypo==perpendicular*perpendicular+base*base)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else 
			return false;

		
	}

	public boolean isScalene() {
		if(s1!=s2 && s1!=s3 && s3!=s2)
		{
			return true;
		}
		else
			return false;

	}
	public boolean isIsosceles() {
			
		if(s1==s2 || s2==s3 || s3==s1)
		{
			return true;
		}
		else
			return false;
	}
	
	public boolean isEquilateral() {
	
		if(s1==s2 && s2==s3 && s3==s1)
		{
			return true;
		}
		else 
			return false;
	}
}		
	
	