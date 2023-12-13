package model;

import java.math.BigDecimal;

public class Account {
    public AccountInfo getAccountInfo() {
        return accountInfo;
    }

    public long getAadhar_number() {
        return aadhar_number;
    }

    public void setAadhar_number(long aadhar_number) {
        this.aadhar_number = aadhar_number;
    }
    public boolean isKyc(){
        return aadhar_number != 0;
    }
    public Account(AccountInfo accountInfo, Address address, long ph){
        this.accountInfo = accountInfo;
        this.address = address;
        this.ph = ph;
        this.aadhar_number = 0;
        this.balance = BigDecimal.ZERO;
    }
    private final AccountInfo accountInfo;
    private long aadhar_number, ph;

    public Address getAddress() {
        return address;
    }

    private Address address;

    public long getPh() {
        return ph;
    }

    public void setPh(long ph) {
        this.ph = ph;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    private BigDecimal balance;
}
