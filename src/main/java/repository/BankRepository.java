package repository;
import model.*;

import java.util.*;

public class BankRepository {
    Map<Long, Account> allAccounts = new HashMap<>();
    Map<Long, List<Transaction>> allTransactions = new HashMap<>();
    public void addAccount(Account ac){
        allAccounts.put(ac.getAccountInfo().getAccount_number(), ac);
        allTransactions.put(ac.getAccountInfo().getAccount_number(), new ArrayList<>());
    }
    public boolean isAccountExist(long account_no){
        return allAccounts.containsKey(account_no);
    }
    public Account getAccount(long account_no){
        return allAccounts.getOrDefault(account_no, null);
    }
    public Set<Long> allAccounts(){
        return allAccounts.keySet();
    }
    public List<Transaction> getAllTransactions(long account_no){
        if(isAccountExist(account_no)){
            return allTransactions.get(account_no);
        }
        return new ArrayList<>();
    }
}
