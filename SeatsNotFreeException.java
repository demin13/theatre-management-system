public class SeatsNotFreeException extends Exception
{
    int[] invalidSeats=new int[50];
    int num;
    
	public SeatsNotFreeException(int invalidSeatsX[], int numX)
	{
    	invalidSeats=invalidSeatsX;
    	num=numX;
	}
	
	public int[] getInvalidSeats()
	{
    	return invalidSeats;
	}
}