package pizza;

//builds popular pizzas step by step
public class PizzaDirector {
    public void makeMargherita(PizzaBuilder builder) {
        builder.setSize("Medium");
        builder.setCrust("Thin");
        builder.setSauce("Tomato");
        builder.setCheese("Mozzarella");
        builder.addToppings("Fresh basil");
        builder.setExtraCheese(false);
    }

    public void makePepperoni(PizzaBuilder builder) {
        builder.setSize("Large");
        builder.setCrust("Stuffed");
        builder.setSauce("Tomato");
        builder.setCheese("Mozzarella");
        builder.addToppings("Pepperoni, Oregano");
        builder.setExtraCheese(true);
    }
}