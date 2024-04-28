public class OrderTest {

    public static void main(String[] args) {

        Order order = new OrderAction();
        order.calculateTotal(10.0, 2);
        order.placeOrder("John Doe", "123 Main St");

        Generate generate = new OrderAction();
        generate.generateInvoice("order_123.pdf");

        Send send =  new NotificationSender();
        send.sendEmailNotification("johndoe@example.com");
    }
}