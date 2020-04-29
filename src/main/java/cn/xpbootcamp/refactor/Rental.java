package cn.xpbootcamp.refactor;

import java.util.Enumeration;
import java.util.Vector;

public class Rental {
    private int id;
    private Vector<RentalItem> rentals = new Vector<>();
    private String rentDate = "";
    private String renterName = "";

    Rental(int id,String rentDate){
        this.id = id;
        this.rentDate = rentDate;
    }

    public int getId(){
        return id;
    }

    public String getRenterName() {
        return renterName;
    }

    public void setRenterName(String renterName) {
        this.renterName = renterName;
    }

    void addRentalItem(RentalItem rentalItem){
        rentals.add(rentalItem);
    }


    String getRecipt(){
        double totalAmount = 0d;
        int frequentRenterCredit = 0;
        Enumeration<RentalItem> rentals = this.rentals.elements();
        StringBuilder result = new StringBuilder("Rental Record for " + getRenterName() + " ("+this.rentDate+")：\n");
        while (rentals.hasMoreElements()) {
            RentalItem each = rentals.nextElement();
            double thisAmount = each.getRentPrice();

            frequentRenterCredit += each.getRentCredit();

            result.append("\t")
                    .append(each.getMovie().getTitle())
                    .append("\t")
                    .append(thisAmount).append("\n");
            totalAmount += thisAmount;
        }

        result.append("Amount owed is ").append(totalAmount).append("\n");
        result.append("You earned ").append(frequentRenterCredit).append(" frequent renter points");
        return result.toString();
    }


}
