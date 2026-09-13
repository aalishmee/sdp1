package pizza;

public class Main {
    public static void main(String[] args) {
        PizzaDirector director = new PizzaDirector();

        //margherita pizza
        PizzaBuilder margheritaBuilder = new MargheritaBuilder();
        director.makeMargherita(margheritaBuilder);
        Pizza margherita = (Pizza) margheritaBuilder.getResult();
        System.out.println(margherita);

        //pepperoni pizza
        PizzaBuilder pepperoniBuilder = new PepperoniBuilder();
        director.makePepperoni(pepperoniBuilder);
        Pizza pepperoni = (Pizza) pepperoniBuilder.getResult();
        System.out.println(pepperoni);

        //recipe card
        PizzaBuilder recipeBuilder = new PizzaRecipeBuilder();
        director.makePepperoni(recipeBuilder);
        PizzaRecipe recipe = (PizzaRecipe) recipeBuilder.getResult();
        System.out.println(recipe);
    }
}