package CourseDay6;

public class PayMain {

    public static void main(String[] args) {
        PaytmAccount acc = new PaytmAccount("34343434", "ABC", 0);
        Thread p1 = new PayThread("addMoney", 2424,acc);
        Thread p2 = new PayThread("makePayment", 2420,acc);

        p1.start();
        p2.start();
    }
}

