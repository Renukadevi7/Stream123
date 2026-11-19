package report;

import bank.account.Account;

public class Report extends Account {


    public class ReportPrinter {
        void print() {
            Account a = new Account();
            a.pin;          // ❌
            a.balance;      // ❌
            a.accountType;  // ❌ "accountType has protected access in Account"
            a.holderName;   // ✅ only public works
        }
    }
}
