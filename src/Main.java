public class Main {
    public static void main(String[] args) {
        HandleOrders handleOrders = new HandleOrders();
        handleOrders.handleCustomPizzaOrder();
        handleOrders.displayCustomPizzas();

        OrderLogs orderLogs = new OrderLogs();
        orderLogs.addOrderLog("订单1已创建");
        orderLogs.handleLogs();

        PizzaOrderQueue pizzaOrderQueue = new PizzaOrderQueue();
        pizzaOrderQueue.addOrderToQueue("披萨1，配料：芝士、番茄");
        pizzaOrderQueue.handleQueueOperations();
    }
}