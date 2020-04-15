import java.util.Scanner;
public class Main {
    public static void main(String[] arhs) {
        userlogin obj1 = new userlogin();
        boolean isExit = true;
        System.out.println("---------------------------------Theatre Management System--------------------------");
        //System.out.println("1.User\n2.Admin");
        while (isExit) {
            System.out.println("1.User\n2.Admin\n3.Exit");
            System.out.println("Choose from above options:");
            int inp = obj1.getInt();
            switch (inp) {
                case 1:
                    System.out.println("1.Signin\n2.Signup\n3.Exit");
                    System.out.println("Choose from above options:");
                    inp = obj1.getInt();
                    switch (inp) {
                        case 1:
                            obj1.Signin();
                            break;
                        case 2:
                            obj1.Signup();
                            break;
                        case 3:
                            isExit = false;
                    }
                    break;
                case 2:
                    obj1.a_login();
                    break;
                case 3:
                    isExit = false;
            }
        }
    }
}
