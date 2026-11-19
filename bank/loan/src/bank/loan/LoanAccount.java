package bank.loan;

import bank.account.Account;

public class LoanAccount extends Account {


         void show() {
            pin;            // ❌ private
            balance;        // ❌ "balance is not public in Account; cannot be accessed from outside package"
            accountType;    // ✅ protected: I inherited it
            holderName;     // ✅
        }


        void test() {
            System.out.println(accountType);       // ✅ inherited

            LoanAccount me = new LoanAccount();
            System.out.println(me.accountType);    // ✅ reference type = subclass

            Account parent = new Account();
            System.out.println(parent.accountType); // ❌ COMPILE ERROR
        }

  }


