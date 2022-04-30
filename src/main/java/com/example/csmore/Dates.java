package com.example.csmore;

import java.time.LocalDate;

public class Dates {
    LocalDate date;
    int amount;
    String operation;

    public Dates(LocalDate date, int amount, String operation) {
        this.date = date;
        this.amount = amount;
        this.operation = operation;
    }

    @Override
    public String toString() {
        return date + " | " + amount + "CZK | " + operation + "\n";
    }
}
