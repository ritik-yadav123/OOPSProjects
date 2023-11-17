package Bank;
public class BankDetailsUse {
    public static void main(String[] args)  {
        BankDetails p1=new BankDetails("Ritik","SBIN0001");
        p1.addMoney(5000.0);
        p1.withdrawMoney(200);
        System.out.println(p1.totalBalance());
        BankDetails p2=new BankDetails("Tushar","SBIN0001");
        BankDetails p3=new BankDetails("Tushar","SBIN0001");
      //  System.out.println( BankDetails.bankName);
        //System.out.println(BankDetails.numOfAccounts);
      //  System.out.println(p1.getAccNo());
      //  System.out.println(p3.submitAmount);
    }
}
