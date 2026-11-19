package bank.account;

    public class Account {


        private   String pin = "1234";            // only Account
        double    balance = 500.0;                // default: only com.bank.account
        private   String accountType = "SAVINGS";
        public String holderName = "Renu";

//      protected String accountType = "SAVINGS"; // package + subclasses
//        public    String holderName = "Renu";     // everyone

        private void checkPin() {
            System.out.println(pin);   // ✅ same class: everything works
        }
    }

