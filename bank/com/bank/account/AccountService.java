 package com.bank.account;

 import bank.account.Account;

 public class AccountService {


     void test() {
        Account a = new Account();

//        a.pin;          // ❌ "pin has private access in Account"
//        a.balance;      // ✅ default: same package
//        a.accountType;  // ✅ protected includes the same package
//        a.holderName;   // ✅
    }
}

