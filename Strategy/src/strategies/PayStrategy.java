package strategies;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetalis();
}
