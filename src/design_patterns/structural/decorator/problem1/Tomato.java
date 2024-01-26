package design_patterns.structural.decorator.problem1;


// ▬ "Extends" the "ToppingsDecorator" Class ▬
public class Tomato extends ToppingsDecorator {

    // ▼ "Object Declaration" ▼
    Pizza pizza;


    // ▬ "Constructor" ▬
    public Tomato(String description, Pizza pizza) {
        super(description);
        this.pizza = pizza;
    }



    // ▬ The "getCost()" Override Method ▬
    @Override
    public int getCost() {
        // ▼ "Toppings Cost" & "Base Cost" ▼
        return 5 + pizza.getCost();
    }


    // ▬ The "getDescription()" Override Method ▬
    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Tomato Toppings";
    }
}
