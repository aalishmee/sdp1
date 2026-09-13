package pizza;

public class PizzaRecipeBuilder implements PizzaBuilder {
    private PizzaRecipe recipe = new PizzaRecipe();

    public void setSize(String size) {
        recipe.setSize(size);
    }

    public void setCrust(String crust) {
        recipe.setCrust(crust);
    }

    public void setSauce(String sauce) {
        recipe.setSauce(sauce);
    }

    public void setCheese(String cheese) {
        recipe.setCheese(cheese);
    }

    public void addToppings(String toppings) {
        recipe.setToppings(toppings);
    }

    public void setExtraCheese(boolean extraCheese) {
        recipe.setExtraCheese(extraCheese);
    }

    public Object getResult() {
        return recipe;
    }
}