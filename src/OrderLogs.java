import java.util.ArrayDeque;
import java.util.Scanner;

public class OrderLogs {
    private ArrayDeque<String> orderLogs = new ArrayDeque<>();

    public OrderLogs() {
        // 构造函数初始化栈
    }

    public void addOrderLog(String log) {
        orderLogs.push(log);
    }

    private void mostRecentLogEntry() {
        if (!orderLogs.isEmpty()) {
            System.out.println("最近的日志条目: " + orderLogs.peek());
        } else {
            System.out.println("栈为空，没有日志条目。");
        }
    }

    private String getOrderLog() {
        if (!orderLogs.isEmpty()) {
            return orderLogs.pop();
        } else {
            System.out.println("栈为空，无法获取日志条目。");
            return null;
        }
    }

    private void removeAllLogEntries() {
        orderLogs.clear();
        System.out.println("所有日志条目已删除。");
    }

    private boolean orderLogsEmpty() {
        return orderLogs.isEmpty();
    }

    public void handleLogs() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("选择你想对订单日志执行的操作：");
            System.out.println("1. 显示所有日志");
            System.out.println("2. 显示最近的日志");
            System.out.println("3. 删除一个日志条目");
            System.out.println("4. 删除所有日志条目");
            System.out.println("5. 检查日志是否完全为空");
            System.out.println("输入你的选择（1 - 5）");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    for (String log : orderLogs) {
                        System.out.println(log);
                    }
                    break;
                case 2:
                    mostRecentLogEntry();
                    break;
                case 3:
                    getOrderLog();
                    break;
                case 4:
                    removeAllLogEntries();
                    break;
                case 5:
                    if (orderLogsEmpty()) {
                        System.out.println("日志完全为空");
                    } else {
                        System.out.println("日志并非完全为空");
                    }
                    break;
                default:
                    System.out.println("无效选择，请重新输入。");
            }
        }
    }
}