package util;
import model.Account;
import model.AccountInfo;
import model.Address;

import java.math.BigDecimal;
import java.util.*;
import service.*;
import model.*;
import java.time.LocalDate;
/*
1. add an account
2. get balance(account)
3. deposit - without using sync make it thread safe
4. withdraw
5. find all account with 0 balance
6. isKycDone;
7. levyChargeBalance() -500 everyEOD
8. calculateSavingInterest and deposit every 30 days interest @6%
 */
public class Main {
    public static void main(String[] args) {
        BankService bs = new BankService();
        bs.addAccount(
                    new Account(new AccountInfo(123, "Rohit", LocalDate.of(2000, 12, 11)),
                    new Address("WB", "kolkata","sk market", 548423),
                    87974567l)
        );

        bs.addAccount(
                new Account(new AccountInfo(234, "Amar", LocalDate.of(2010, 1, 11)),
                new Address("Tamil Nadu", "Trichy","Thubakudi", 435511),
                6798654678l)
        );

        bs.deposit(123, BigDecimal.valueOf(500));
        bs.deposit(234, BigDecimal.valueOf(450));
        bs.withdraw(123, BigDecimal.valueOf(200));
        bs.doKyc(123, 45674537);
        //to see more check bankManager.java file
    }
}
