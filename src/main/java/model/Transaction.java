package model;

import java.time.LocalDate;

public class Transaction {
    static int id = 0;
    Long account_no;
    String comment;
    String type;
    LocalDate time;
    public Transaction(Long account_no, String type, String comment){
        id += 1;
        this.account_no = account_no;
        this.type = type;
        this.comment = comment;
    }
}
