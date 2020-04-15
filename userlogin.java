
import java.util.*;
import java.io.*;


public class userlogin{

    public static void u_login(){
        System.out.println("login success");
    }
    public static void a_login(){
        System.out.println("admin login success");
    }
    public static void Signin(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Email id :");
        String mail_id=input.nextLine();
        System.out.println("Enter your password :");
        String pass=input.nextLine();
        System.out.println("login success");
    }
    public static void Signup(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Name :");
        String name=input.nextLine();
        System.out.println("Enter your Email id :");
        String mail_id=input.nextLine();
        System.out.println("Enter your password :");
        String password=input.nextLine();
        System.out.println("Confirm your password :");
        String c_password=input.nextLine();
        System.out.println("signup success");
    }
    public static int getInt() {
        Scanner input = new Scanner(System.in);
        int in;
        try {
            in = input.nextInt();
            return in;
        }
        catch(InputMismatchException e){
            System.out.println("Enter valid option");
        }
     return 0;
    }
}