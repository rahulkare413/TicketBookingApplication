package application1;

public class Customer {
    private String name ;
    private int age ;
    private int phn ;
    private int qty ;

    public Customer(String name, int age, int phn, int qty) {
        this.name = name;
        this.age = age;
        this.phn = phn;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPhn() {
        return phn;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
