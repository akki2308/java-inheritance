class Order {
    // Class attributes
    protected int orderId;
    protected String orderDate;

    // Constructor
    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to get order status
    public void getOrderStatus() {
        System.out.println("Order Id: " + orderId);
        System.out.println("Order Placed on: " + orderDate);
    }
}

// Subclass
class ShippedOrder extends Order {
    // Class attributes
    private String trackingNumber;
    private String shippingDate;

    // Subclass constructor
    public ShippedOrder(int orderId, String orderDate, String shippingDate, String trackingNumber) {
        // Calling base class constructor
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
        this.shippingDate = shippingDate;
    }

    // Method to get order status
    @Override
    public void getOrderStatus() {
        // Overriding base class method
        super.getOrderStatus();
        System.out.println("Order Shipped on: " + shippingDate);
        System.out.println("Order Tracking Number: " + trackingNumber);
    }
}

// Subclass
class DeliveredOrder extends ShippedOrder {
    // Class attributes
    private String deliveryDate;

    // Subclass constructor
    public DeliveredOrder(int orderId, String orderDate, String shippingDate, String trackingNumber, String deliveryDate) {
        // Calling superclass constructor
        super(orderId, orderDate, shippingDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    // Method to get order status
    @Override
    public void getOrderStatus() {
        // Overriding superclass method
        super.getOrderStatus();
        System.out.println("Order Delivered on: " + deliveryDate);
    }
}

public class OnlineOrderManagementSystem {
    public static void main(String[] args) {
        System.out.println("Order Placement Status:");
        Order order = new Order(101, "2025-03-11");
        order.getOrderStatus();

        System.out.println("\nOrder Shipment Status:");
        ShippedOrder shippedOrder = new ShippedOrder(101, "2025-03-11", "2025-03-13","MAR25-101");
        shippedOrder.getOrderStatus();

        System.out.println("\nOrder Delivery Status:");
        DeliveredOrder deliveredOrder = new DeliveredOrder(101, "2025-03-11", "2025-03-13", "MAR25-101", "2025-03-15");
        deliveredOrder.getOrderStatus();
    }
}

