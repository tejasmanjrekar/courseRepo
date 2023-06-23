package CourseDay6;

public class PayThread extends Thread{

        private PaytmAccount account;
        private int amount=0;

        public PayThread(){

            super();
        }
        public PayThread(String name, int amount, PaytmAccount account){
            super(name);
            this.amount=amount;
            this.account=account;
        }

        public void run(){
            Thread currentThread=Thread.currentThread();
            String tname=currentThread.getName();
            if(tname.equals("addMoney")){
                account.addMoney(amount);
            }
            else if(tname.equals("makePayment")){
                account.makePayment(amount);
                try {
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }

}
