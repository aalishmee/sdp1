package pizza;

public class Pizza {
    private String size;       //"small", "medium", "large"
    private String crust;      //"thin", "thick", "stuffed"
    private String sauce;      //"tomato", "BBQ", "pesto"
    private String cheese;     //"mozzarella", "cheddar", "none"
    private String toppings;   //"pepperoni, mushrooms"
    private boolean extraCheese;

    public String getSize()          { return size; }
    public String getCrust()         { return crust; }
    public String getSauce()         { return sauce; }
    public String getCheese()        { return cheese; }
    public String getToppings()      { return toppings; }
    public boolean hasExtraCheese()  { return extraCheese; }

    // Package-private setters are only classes in the pizza package that can call them
    void setSize(String size)                { this.size = size; }
    void setCrust(String crust)              { this.crust = crust; }
    void setSauce(String sauce)              { this.sauce = sauce; }
    void setCheese(String cheese)            { this.cheese = cheese; }
    void setToppings(String toppings)        { this.toppings = toppings; }
    void setExtraCheese(boolean extraCheese) { this.extraCheese = extraCheese; }

    public String toString() {
        return "Pizza {"
                + " size=" + size
                + ", crust=" + crust
                + ", sauce=" + sauce
                + ", cheese=" + cheese
                + ", toppings=" + toppings
                + ", extraCheese=" + extraCheese
                + " }";
    }
}