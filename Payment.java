public class Payment {
    private int paymentId;

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    private PaymentType paymentType;
    private double amount;
    public Payment(int paymentId,PaymentType paymentType,double amount){
        this.paymentId=paymentId;
        this.paymentType=paymentType;
        this.amount=amount;
    }



}
