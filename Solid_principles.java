// Banking Software
public interface Intertransaction{
  public void transact(Long amount, String Acc,String type);
}
public interface Notification {
  public void otp(String type);
}

public class clastransaction implements Intertraction{
  public void transact(Long amount, String Acc,String type){
    if (type=="deposite")
    {
      //deposite logic
    }
    else
    {
      //withdraw logic
    }
  }
}
public class clasNotification implements Notification{
  public void otp(String type)
  {
    if (type=="Whatsapp")
    {
      //whatsapp otp locic
    }
    else if (type=="Mobile")
    {
      //mobile otp logic
    }
  }

}
public class ATMtrancation implements Intertraction{
  public void transact(Long amount, String Acc,String type){
    if (type=="deposite")
    {
      //deposite logic
    }
    else
    {
      //withdraw logic
    }
  }
}
public class transaction msg extends classNotification{
  public void transdetails(int amount){
    System.out.println("transaction of"+ amount + "is done")
  }
}
public interface BankCard {
  public void doTransaction(int amount);
}
public class CreditCard implements BankCard{
public void doTransaction(int amount){
  System.out.println("tx done with CreditCard");
    }
}
public class DebitCard implements BankCard{
public void doTransaction(int amount){
System.out.println("tx done with DebitCard");
    }
}
class Gettype{
  public static BankCard(String type){
    if (type=="Debit")
    {
      return new DebitCard();
    }
    else
    {
      return new CerditCArd();
    }
  }
}
public class Solid_principles {
private BankCard bankCard;
public ShoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }
public void doPayment(Object order, int amount){
        bankCard.doTransaction(amount);
    }
public static void main(String[] args) {
        BankCard bankCard=Gettype.BankCard("String")
        bankCard.doPayment("do some order", 10000);
    }
}
