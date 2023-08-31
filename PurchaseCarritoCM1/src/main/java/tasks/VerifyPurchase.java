public class VerifyPurchase { //Maneja el proceso de pagos y la finalizacion de la compra
    public void processPayment(String creditCardNumber, double totalPrice) {
        System.out.println("Procesando el pago de $"+ totalPrice + "con la tarjeta" + maskCreditCard(creditCardNumber));
        boolean paymentSuccessful = simulatePaymentProcessing(totalPrice);

        if (paymentSuccessful) {
            System.out.println("Pago exitoso. Gracias por su compra.");
        } else {
            System.out.println("El pago ha fallado. Por favor, intente nuevamente.");
        }
    }
    private String maskCreditCard(String creditCardNumber) {
        return "++++ ++++ ++++" + creditCardNumber.substring(12);
    }
    private boolean simulatePaymentProcessing(double totalPrice) {
        return true;
    }
}
