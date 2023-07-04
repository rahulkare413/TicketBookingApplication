package application1;

public class Service {
    private static int ticketCount = 100 ;
    private Customer[] customerList = new Customer[100];

    public void  bookTicket( Customer c )
    {
        for (int i=0 ; i<customerList.length ; i++)
        {
            if(customerList[i]==null) {
                customerList[i] = c;
                break;
            }
        }

        ticketCount -= c.getQty();
    }

    public void cancelTicket(int phn , int qty)
    {
        for (Customer c : customerList)
        {
            if (c != null && c.getPhn() == phn && c.getQty() >= qty)
            {
                c.setQty(c.getQty() - qty);
                if (c.getQty() == 0)
                {
                   deleteCustomer(phn);
                    ticketCount +=qty;
                }
                break;
            }
        }
    }

    public void deleteCustomer(int phn)
    {
        for (int i = 0 ; i< customerList.length ; i++)
        {
            if (customerList[i]!= null && customerList[i].getPhn() == phn)
                customerList[i] = null;
        }
    }

    public void displayTicket()
    {
        for (Customer c : customerList)
        {
            if (c != null)
            {
                System.out.println("----------------------------------");
                System.out.println("| NAME        : "+ c.getName()+"\t|");
                System.out.println("| AGE         : "+ c.getAge()+"\t|");
                System.out.println("| PHN NUMBER  : "+ c.getPhn()+"\t|");
                System.out.println("| QTY         : "+ c.getQty()+"\t|");


            }
        }
    }
}

