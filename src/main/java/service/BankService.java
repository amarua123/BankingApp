package service;
import repository.*;
import model.*;

import java.math.BigDecimal;

public class BankService {
    BankRepository bankRepository = new BankRepository();
    public void addAccount(Account ac){
        bankRepository.addAccount(ac);
    }
    public void doKyc(long account_no, long aadhar_no){
        if(bankRepository.isAccountExist(account_no)){
            Account account = bankRepository.getAccount(account_no);
            account.setAadhar_number(aadhar_no);
        }else{
            System.out.println("Account Not Exists !!");
        }
    }
    public boolean isKycDone(long account_no){
        if(bankRepository.isAccountExist(account_no)){
            Account account = bankRepository.getAccount(account_no);
            return account.isKyc();
        }else{
            System.out.println("Account Not Exists !!");
        }
        return false;
    }
    public BigDecimal fetchBalance(long account_no){
        if(bankRepository.isAccountExist(account_no)){
            Account account = bankRepository.getAccount(account_no);
            return account.getBalance();
        }else{
            System.out.println("Account Not Exists !!");
        }
        return BigDecimal.ZERO;
    }
    public void deposit(long account_no, BigDecimal amount){
        if(bankRepository.isAccountExist(account_no)){
            Account account = bankRepository.getAccount(account_no);
            BigDecimal old_balance = account.getBalance();
            account.setBalance(old_balance.add(amount));
            System.out.println("Rs "+ amount +" is credited to the account number "+account_no);
        }else{
            System.out.println("Account Not Exists !!");
        }
    }
    public void withdraw(long account_no, BigDecimal amount){
        if(bankRepository.isAccountExist(account_no)){
            Account account = bankRepository.getAccount(account_no);
            BigDecimal old_balance = account.getBalance();
            if(old_balance.compareTo(amount) >= 0){
                account.setBalance(old_balance.subtract(amount));
                System.out.println("Rs "+ amount +" is debited from the account number "+account_no);
            }else{
                System.out.print("Sorry! Insufficient Balance.");
            }
        }else{
            System.out.println("Account Not Exists !!");
        }
    }
}
