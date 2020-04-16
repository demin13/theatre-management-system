import java.util.*;
import java.io.*;
public class Show
{
    String showName;
    String showDate;
    double collection;
    int numBookings;
    char[] seatStatus=new char[50];
    int numofseatsRemaining[]=new int[50];
    int[] freeSeats=new int[50];
    Booking[] booking=new Booking[50];
public Show( String showNameX, String showDateX)
{
    showDate=showDateX;
    showName=showNameX;
    for (int i = 0; i <= 49; i++)
    {
        seatStatus[i]='f';
    }
}
public String getShowName()
{
    return showName;
}
public String getShowDate()
{
    return showDate;
}
public char[] getAllSeatsStatus()
{
    return seatStatus;
}
public Booking[] getAllBookings()
{
    for(int i=0; i<booking.length; i++)
    {
        booking[i].getPersonID();
        booking[i].getDate();
        booking[i].getAmount();
    }
    return booking;
}
public int getNumSeatsRemaining()
{
    int numofseatsRemaining=0;
    for(int j=1; j<=50; j++)
    {
        if(getAllSeatsStatus()[j]=='f')
            numofseatsRemaining++;
    }
    return numofseatsRemaining;
}
public int getNumBookings()
{
    for(int i=0; booking[i]!=null; i++)
    {
        numBookings++;
    }
    return numBookings;
}
public int[]getFreeSeats()
{
    return numofseatsRemaining;
}
public double getCollection()
{
    return collection;
}
public void bookSeats(int seats[])
{
}
public boolean addBooking(Booking B)
{
    return true;
}
public void addToCollection(double amount)
{
    collection+=amount;
}
}