package CourseDay6;

public class PaytmAccount{

   private String mobileNo;
   private String name;
   private int balance;

   private boolean status;

    public PaytmAccount(){

    }


    public PaytmAccount(String mobileNo, String name, int balance) {
        super();
        this.mobileNo = mobileNo;
        this.name = name;
        this.balance = balance;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "PaytmAccount{" +
                "mobileNo='" + mobileNo + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    public synchronized void addMoney(int deposit){
        if(status){
            try{
                wait();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Balance before deposit:"+this.balance);
        this.balance+=deposit;
        System.out.println("Balance after deposit:"+this.balance);
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        status=true;
        notify();
    }

    public synchronized void makePayment(int withdraw){
        if(!status){
            try {
                wait();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        status=false;
        System.out.println("Balance before withdrawing money"+this.balance);
        this.balance-=withdraw;
        System.out.println("Balance after making payment is:"+this.balance);
        notify();

    }
}
