import java.util.ArrayList;
import java.util.Scanner;

public class HandleOrders {
    private ArrayList<CustomPizza> customPizzas = new ArrayList<>();

    public void handleCustomPizzaOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择定制披萨的配料（以逗号分隔）：");
        String[] toppingInputs = scanner.nextLine().split(",");
        StringBuilder customPizzaToppings = new StringBuilder();
        for (String topping : toppingInputs) {
            customPizzaToppings.append(topping.trim()).append(", ");
        }
        if (customPizzaToppings.length() > 0) {
            customPizzaToppings.setLength(customPizzaToppings.length() - 2);
        }
        System.out.println("请输入定制披萨的价格：");
        double customPizzaPrice = scanner.nextDouble();
        CustomPizza customPizza = new CustomPizza(customPizzaToppings.toString(), customPizzaPrice);
        customPizzas.add(customPizza);
    }

    public void displayCustomPizzas() {
        for (CustomPizza pizza : customPizzas) {
            System.out.println(pizza);
        }
    }
}