package Tugas;

public class Payment {
    public static void main(String[] args) {
        PaymentProcessing paying;

        paying = new bankAcehCounter();
        paying.total();

        paying = new BSICounter();
        paying.total();

        paying = new gopayCounter();
        paying.total();

        paying = new danaCounter();
        paying.total();
    }
}
