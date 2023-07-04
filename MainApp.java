package application1;

import java.util.Scanner;

public class MainApp {
    static private int count = 0 ;
    static Service service = new Service();
   static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean status = true;

        while (status) {
            System.out.println("<------------------>");
            System.out.println("1. BOOK TICKET ");
            System.out.println("2. CANCEL TICKET ");
            System.out.println("3. DISPLAY TICKET ");
            System.out.println("4. exit");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    bookTicket();
                    break;
                case 2:
                    cancelTicket();
                    break;
                case 3:
                    displayTicket();
                    break;
                case 4:
                    status = false;
                    break;
                default:
                    System.err.println("invalid choice !!");
            }

        }

    }
    public static void bookTicket()
    {
        System.out.println("ENTER NAME ");
        String name = sc.next();
        System.out.println("ENTER AGE ");
        int age = sc.nextInt();
        System.out.println("ENTER PHN NUMBER ");
        int phn = sc.nextInt();
        System.out.println("ENTER TICKET QTY ");
        int qty = sc.nextInt();

        Customer c = new Customer(name , age , phn , qty);
        service.bookTicket(c);

        System.out.println("------------------------------");
        System.out.println("NAME : "+ name );
        System.out.println("AGE  : "+ age );
        System.out.println("QTY  : "+ qty );
        System.out.println("TOTAL COST : "+ (qty * 10));
        System.out.println("------------------------------");
    }

    public static void cancelTicket()
    {
        System.out.println("CUSTOMER PHN NUMBER ");
        int phn = sc.nextInt();
        System.out.println("TICKET QUANTITY TO CANCEL");
        int qty = sc.nextInt();
        service.cancelTicket(phn,qty);
    }


    public static void displayTicket()
    {
        System.out.println("ENTER  PASSWORD ");
        String password = sc.next();
        if (password.equals("abcd"))
            service.displayTicket();
        else {
            count++;
            System.err.println("WRONG PASSWORD !!");
            if (count == 3)
                System.exit(0);
        }

    }


}


