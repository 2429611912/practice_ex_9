import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PizzaOrderQueue {
    private Queue<String> orderQueue = new LinkedList<>();

    public void addOrderToQueue(String order) {
        orderQueue.add(order);
    }

    public void displayQueue() {
        for (String order : orderQueue) {
            System.out.println(order);
        }
    }

    public void processNextOrder() {
        if (!orderQueue.isEmpty()) {
            System.out.println("正在处理订单: " + orderQueue.poll());
        } else {
            System.out.println("没有等待处理的订单。");
        }
    }

    public boolean isQueueEmpty() {
        return orderQueue.isEmpty();
    }

    public void handleQueueOperations() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("选择你想对披萨订单队列执行的操作：");
            System.out.println("1. 添加订单到队列");
            System.out.println("2. 显示队列中的所有订单");
            System.out.println("3. 处理下一个订单");
            System.out.println("4. 检查队列是否为空");
            System.out.println("输入你的选择（1 - 4）");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("请输入订单详情：");
                    String order = scanner.nextLine();
                    addOrderToQueue(order);
                    break;
                case 2:
                    displayQueue();
                    break;
                case 3:
                    processNextOrder();
                    break;
                case 4:
                    if (isQueueEmpty()) {
                        System.out.println("队列完全为空");
                    } else {
                        System.out.println("队列并非完全为空");
                    }
                    break;
                default:
                    System.out.println("无效选择，请重新输入。");
            }
        }
    }
}