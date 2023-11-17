package Bank;

public class BankDetails {
      String name;
      String nickName;
      static int numOfAccounts;
      private int accno;
      String ifsc;
      final static  String bankName="SBI";
      private Double balance;

    public BankDetails(String name, String ifsc, String nickName){
           this.name=name;
           this.ifsc=ifsc;
           this.nickName=nickName;
           numOfAccounts++;
           accno=numOfAccounts;
     }
      public BankDetails(String name, String ifsc){
        balance=0.0;
            this.name=name;
            this.ifsc=ifsc;
            numOfAccounts++;
            accno=numOfAccounts;
      }

    public  int getAccNo(){
        return this.accno;
    }
    public double totalBalance(){
        return this.balance;}
    public  void addMoney(double submitAmount){
        this.balance+=submitAmount;}
    public void withdrawMoney(double withdrawnMoney){
        this.balance-=withdrawnMoney;
    }
}
