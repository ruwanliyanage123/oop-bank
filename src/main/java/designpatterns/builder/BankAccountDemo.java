package designpatterns.builder;

import java.time.LocalDate;

public class BankAccountDemo {
    BankAccount myAccount = new BankAccount("123456789", "John Doe", "Main Branch", "0001", "USD", "555-1234", "john.doe@example.com", "Checking", 1000.00, 1.5, 500.00, LocalDate.of(2024, 1, 1), LocalDate.of(2024, 9, 20), false, "123 Elm Street, Springfield, ST 12345", true);
}
