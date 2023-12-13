package model;

import java.time.LocalDate;

public class AccountInfo {
    public long getAccount_number() {
        return account_number;
    }

    public void setAccount_number(long account_number) {
        this.account_number = account_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate_of_opening() {
        return date_of_opening;
    }

    public void setDate_of_opening(LocalDate date_of_opening) {
        this.date_of_opening = date_of_opening;
    }

    public AccountInfo(long account_number, String name, LocalDate date_of_opening) {
        this.account_number = account_number;
        this.name = name;
        this.date_of_opening = date_of_opening;
    }

    @Override
    public String toString() {
        return "name: "+name+", accNo: "+account_number+", opening date: "+date_of_opening;
    }

    private long account_number;
    private String name;
    private LocalDate date_of_opening;
}
