import java.util.*;
import java.io.*;
public abstract class Booking
{
    String date, personID;
    int num;
    char status='b';
    
	public Booking(String dateX, String personIDX, int numX)
	{
    	date=dateX;
    	personID=personIDX;
    	num=numX;
	}
	
	public String getPersonID()
	{
    	return personID;
	}
	
	public String getDate()
	{
    	return date;
	}

	public abstract double getCost();
	public double getAmount()
	{
    	return num;
	}
}