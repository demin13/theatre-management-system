import java.util.*;
import java.io.*;
public class SeatsBooking extends Booking
{
    double cost;
    public int[] seats=new int[50];
    public SeatsBooking(String dateX, String personIDX, int numX, int[] seatsX)
    {
        super(dateX,personIDX,numX);
        seats=seatsX;
    }

    public int[] getSeats()
    {
        return seats;
    }

    public double getCost()
    {
        if (seats.length == 3 || seats.length ==4)
        {
            cost=((seats.length)*20);
            cost=(cost-(cost*10/100));
            //cost=((seats.length)*20)-((seats.length)*10/100);
        }
    
        if (seats.length >= 5)
        {
            cost=((seats.length)*20);
            cost=(cost-(cost*20/100));
            //cost=((seats.length)*20)-((seats.length)*20/100);
        }
    
        return cost;
    }
}