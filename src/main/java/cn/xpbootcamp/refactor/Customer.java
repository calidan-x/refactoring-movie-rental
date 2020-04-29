package cn.xpbootcamp.refactor;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class Customer {

    private String name;
    private Dictionary<Integer,Rental> rentals = new Hashtable<>();

    Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void addRental(Rental rental) {
        rental.setRenterName(getName());
        rentals.put(rental.getId(),rental);
    }


    String getReceipt(int rentalId) {
        return rentals.get(rentalId).getRecipt();
    }

}
