package cn.xpbootcamp.refactor;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class CustomerTest {

    @Test
    void should_return_correct_result_when_call_statement() {

        MovieLibrary.addMovie(new Movie(1,"同桌的你",MovieType.CAMPUS));
        MovieLibrary.addMovie(new Movie(2,"宠爱",MovieType.NEW_RELEASE));
        MovieLibrary.addMovie(new Movie(3,"战狼2",MovieType.HISTORY));

        Customer customer = new Customer("老王");

        Rental rental = new Rental(1,"2020-05-01");
        rental.addRentalItem(new RentalItem(1, 4));
        rental.addRentalItem(new RentalItem(2, 5));
        rental.addRentalItem(new RentalItem(3, 6));

        customer.addRental(rental);

        assertThat("Rental Record for 老王 (2020-05-01)：\n" +
                "\t同桌的你\t3.0\n" +
                "\t宠爱\t15.0\n" +
                "\t战狼2\t8.0\n" +
                "Amount owed is 26.0\n" +
                "You earned 4 frequent renter points").isEqualTo(customer.getReceipt(1));
    }

}