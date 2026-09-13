package pizza;

public interface PizzaBuilder {
    void setSize(String size);

    void setCrust(String crust);

    void setSauce(String sauce);

    void setCheese(String cheese);

    void addToppings(String toppings);

    void setExtraCheese(boolean extraCheese);

    //returns the finished product, the type depends on the concrete builder
    Object getResult();
}