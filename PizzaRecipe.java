package pizza;

public class PizzaRecipe {
    private String size;
    private String crust;
    private String sauce;
    private String cheese;
    private String toppings;
    private boolean extraCheese;

    void setSize(String size)                { this.size = size; }
    void setCrust(String crust)              { this.crust = crust; }
    void setSauce(String sauce)              { this.sauce = sauce; }
    void setCheese(String cheese)            { this.cheese = cheese; }
    void setToppings(String toppings)        { this.toppings = toppings; }
    void setExtraCheese(boolean extraCheese) { this.extraCheese = extraCheese; }

    public String toString() {
        return "RECIPE CARD\n"
                + "  Size:         " + size + "\n"
                + "  Crust:        " + crust + "\n"
                + "  Sauce:        " + sauce + "\n"
                + "  Cheese:       " + cheese + "\n"
                + "  Toppings:     " + toppings + "\n"
                + "  Extra cheese: " + extraCheese;
    }
}