public interface loan {  
    public void grantLoan();
}

public class RealLoan implements Loan {
    private String Name;
    public RealLoan(String Name) {
        this.Name = Name;
    }
    public void grantLoan() {
        System.out.println("Loan granted for : "+ Name);
    }
}

public class ProxyLoan implements Loan {
           private String Name;
           private RealLoan  realLoan;
               public ProxyLoan(String Name) {
            this.Name = Name;
        }
        public void grantLoan()
        {
            if (getScore(Name) > 4)
            {
                RealLoan = new RealLoan(employeeName);
                RealLoan.grantLoan();
            }
            else
            {
                System.out.println("No Loan granted. Your cerdit score is below 500");
            }
        }
        public int getScore(String Name) {
            // Some logic
            return 9;
        }
}

public class ProxyPatternClient {
    public static void main(String[] args)
    {
        Loan loan = new Proxyloan("abc");
        loan.grantLoan();
    }
}
