package pizza;

public class PepperoniBuilder implements PizzaBuilder {
    private Pizza pizza = new Pizza();

    public void setSize(String size) {
        pizza.setSize(size);
    }

    public void setCrust(String crust) {
        pizza.setCrust(crust);
    }

    public void setSauce(String sauce) {
        pizza.setSauce(sauce);
    }

    public void setCheese(String cheese) {
        pizza.setCheese(cheese);
    }

    public void addToppings(String toppings) {
        pizza.setToppings(toppings);
    }

    public void setExtraCheese(boolean extraCheese) {
        pizza.setExtraCheese(extraCheese);
    }

    public Object getResult() {
        return pizza;
    }
}