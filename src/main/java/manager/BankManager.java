package manager;

import repository.BankRepository;
import model.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;

public class BankManager {
    static BankRepository bankRepository = new BankRepository();
    public static void main(String[] args) {
        bankRepository.addAccount(
                new Account(new AccountInfo(123, "Rohit", LocalDate.of(2000, 12, 11)),
                        new Address("WB", "kolkata","sk market", 548423),
                        87974567l)
        );

        bankRepository.addAccount(
                new Account(new AccountInfo(234, "Amar", LocalDate.of(2010, 1, 11)),
                        new Address("Tamil Nadu", "Trichy","Thubakudi", 435511),
                        6798654678l)
        );
        //finding all account with zero balance
        List<Account> accountsWithZeroBalance =
                bankRepository.allAccounts().stream().filter(acc -> acc.getBalance().compareTo(BigDecimal.ZERO) <= 0).toList();
        System.out.println(accountsWithZeroBalance);

        //levyChargeBalance() -500 everyEOD
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() { // Function runs every MINUTES minutes.
                for(Account a: accountsWithZeroBalance) {
                    a.charge(BigDecimal.valueOf(500));
                }
            }
        }, 0, 24*60*60*1000);
    }
}
