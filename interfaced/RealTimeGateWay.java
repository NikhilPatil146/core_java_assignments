package com.interfaced;

interface PaymentGateway {
    void processPayment(double amount);
}

class Pay implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

public class RealTimeGateWay {

	public static void main(String[] args) {
		Pay payment = new Pay();
        payment.processPayment(250.75);
	}
}
