import java.util.*;
class project
{
    public static void main(String[] args)
    {
        int option;
        int option2=0;
        int showcount=0;
        int numofseats=0;
        int numofbook=0;
        int breakcount=0;
        double costing = 0;
        double totalcosting = 0;
        int[] bookcount=new int[50];
        char[] seatStatus = new char[50];
        Show[] shows = new Show[50];
        Booking[] books = new Booking[50];
        String showdate,showname,showdatebook,bookpersonid;
        String confirm,seattype;
        Scanner select = new Scanner(System.in);
        Scanner choice = new Scanner(System.in);

        do
        {
            System.out.println("\n");

            System.out.println("----------------------Welcome To Theater Management--------------------------");

            System.out.println("1.Add Show");
            System.out.println("2.Date of shows");
            System.out.println("3.Booking");
            System.out.println("4.Cancel Booking");
            System.out.println("5.Confirm Booking");
            System.out.println("6.Display Collection");
            System.out.println("7.Exit\n");
            System.out.print("Enter Option: ");
            option = select.nextInt();
                     
            if(option==1)
            {
                System.out.println("Add Show Option Selected");
                System.out.print("Enter the Date of the Show [DD/MM/YYYY]: \n");
                showdate = choice.nextLine();
                System.out.print("Enter Name of Show: \n");
                showname = choice.nextLine();
                shows[showcount] = new Show(showname, showdate);
                showcount = showcount + 1;
                System.out.print("Show added successfully");
            }

            if(option==2)
            {
                System.out.println("Display Dates of Shows Selected");
                for (int i = 0; i<showcount; i++)
                {
                    System.out.println("Show Name: " + shows[i].showName);
                    System.out.println("Show Date: " + shows[i].showDate);

                }
                        
                System.out.println("End of Show List.\n");
            }
                    
            if(option==3)
            {
                System.out.println("Make Booking Selected");
                for (int i = 0; i<showcount; i++)
                {
                    System.out.println("Show Name: " + shows[i].showName);
                    System.out.println("Show Date: " + shows[i].showDate);
                    System.out.print("\n\n");
                }
                
                System.out.println("End of Show List.\n");
                System.out.print("Shows Available "+showcount);
                System.out.print("\n");
                System.out.print("Enter Show Date: ");
                showdatebook=choice.nextLine();
                for(int j = 0; j<showcount; j++)
                {
                    if (showdatebook.equals(shows[j].showDate))
                    {
                        System.out.print("Enter your ID: ");
                        bookpersonid = choice.nextLine();
                        System.out.print("Select your Booking Type::\n");
                        System.out.print("Enter F For Free Booking Or Enter B for Seats Booking:::\n");
                        seattype = choice.nextLine();
                        if ((seattype.equals("F")) || (seattype.equals("f")))
                        {
                            System.out.print("Enter The Number Of Seats To Book: ");
                            numofseats = select.nextInt();
                            for (int k=0; k<50; k++)
                            {
                                if (shows[j].seatStatus[k]=='f')
                                {
                                    shows[j].seatStatus[k]='b';
                                    //books[numofbook] = new FreeBooking(showdatebook, bookpersonid, numofseats);
                                    numofbook=numofbook + 1;
                                    breakcount = breakcount + 1;
                                    if(breakcount==numofseats)
                                    {
                                        breakcount = 0;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }

            if(option==4)
            {
                System.out.println("Cancel Booking Selected");
                System.out.print("Enter Show Date: ");
                showdatebook=choice.nextLine();
                System.out.print("Enter your ID: ");
                bookpersonid = choice.nextLine();
                boolean flag=false;
                boolean flag1=false;
                int j;
                for(j = 0; j<showcount; j++)
                {
                    if(shows[j].showDate=="")
                    {
                        break;
                    }

                    if (showdatebook.equals(shows[j].showDate))
                    {
                        System.out.print("Show Date Found");
                        flag=true;
                    }
                }

                for(int k = 0; k<numofbook; k++)
                {
                    if(books[k].personID=="")
                    {
                        break;
                    }
                        
                    if (bookpersonid.equals(books[k].personID))
                    {
                        System.out.print("Person ID Found");
                        flag1=true;
                    }
                }

                if((flag==true)&&(flag1==true))
                {
                    System.out.print("Do You Want To Confirm: (Y/N)");
                    String confirmdel=choice.nextLine();
                    if((confirmdel=="Y")||(confirmdel=="y"))
                    {
                        System.out.print("Yes Selected");
                    }
                            
                    else if((confirmdel=="N")||(confirmdel=="n"))
                    {

                    }
                }
            }
                    
            if(option==5) {
                try{
                System.out.println("Confirm Booking Selected");


                for (int i = 0; i < books.length; i++) {
                    if ((books[i].personID == "") && (books[i].date == "")) {
                        break;
                    }

                    System.out.print(i + " - " + books[i].personID);
                    if (books[i] instanceof SeatsBooking) {
                        System.out.println(" - SeatsBooking");
                    }


                }

                System.out.print("Enter Booking which you want to confirm : ");
                int selection = select.nextInt();
                if (books[selection] instanceof SeatsBooking) {
                    if ((books[selection]).num >= 3 && (books[selection]).num <= 4) {
                        costing = books[selection].num * 18;
                    }
                    else if (books[selection].num >= 5) {
                        costing = books[selection].num * 16;
                    }
                    else {
                        costing = books[selection].num * 20;
                    }

                    for (int k = 0; k < books.length; k++) {
                        if ((books[k].date).equals(shows[k].showDate)) {
                            shows[k].addToCollection(costing);
                        }
                    }
                }
            }
                catch(NullPointerException e){
                    System.out.println("No ticket booked till now");
                }
            }

 
            if(option==6)
            {
                try {
                    System.out.println("Display Collection for a given day\n");
                    for (int i = 0; i < shows.length; i++) {
                        totalcosting = totalcosting + shows[i].getCollection();
                    }

                    System.out.println("The Total Amount Collected is RM " + totalcosting + ".");
                }
                catch (NullPointerException e){
                    System.out.print("Revenue not collected today");
                }
            }

            if(option==7)
            {
                System.out.println("Program Exitting");
                System.out.println("Confirm To Exit (Y/N): ");
                confirm = choice.nextLine();
                if((confirm.compareTo("Y")==0)||(confirm.compareTo("y")==0))
                {
                    option2=1;
                }
                
                else if((confirm.compareTo("n")==0)||(confirm.compareTo("N")==0))
                {
                    option2=0;
                }
                
                else
                {
                    System.out.println("Invalid Selection");
                }
            }
        }
        while(option2==0);
        {
            //print(" ")
        }
    }
}            