# Pizza Builder
A Java demo of the **Builder design pattern** for Assignment #1.

## What it does
Builds pizzas step by step. The same steps can produce:
- a real **Pizza** (Margherita or Pepperoni)
- a **PizzaRecipe** card (same info, different format)

## Files
| Component | File |
|---|---|
| Product | `Pizza.java`, `PizzaRecipe.java` |
| Builder interface | `PizzaBuilder.java` |
| Concrete Builders | `MargheritaBuilder.java`, `PepperoniBuilder.java`, `PizzaRecipeBuilder.java` |
| Director | `PizzaDirector.java` |
| Client | `Main.java` |

## How to build each representation
**Real Pizza** — pass a `MargheritaBuilder` or `PepperoniBuilder` to the Director.
**PizzaRecipe card** — pass a `PizzaRecipeBuilder` to the same Director method. The Director uses only the `PizzaBuilder` interface, so the same call produces a different output.

## How to compile and run
From the folder with `src/`:

    javac -d out src/pizza/*.java
    java -cp out pizza.Main
