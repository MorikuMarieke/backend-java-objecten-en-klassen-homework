import java.util.ArrayList;
import java.util.List;

public class TomatoSoupRecipe {
    Ingredient boullionCube = new Ingredient("Boullion blokje", "stuk", 2);
    Ingredient tomato = new Ingredient("Tomato", "stuk", 6);
    Ingredient oregano = new Ingredient("Oregano", "theelepel", 4);
    Ingredient bellPepper = new Ingredient("Paprika", "stuk", 3);
    Ingredient pepper = new Ingredient("Peper", "theelepel", 0.5);
    Ingredient basil = new Ingredient("Basilicum", "blaadje", 10);
    Ingredient water = new Ingredient("Water", "liter", 1);

    public static List<Ingredient> ingredientList = new ArrayList<>(); {
        ingredientList.add(boullionCube);
        ingredientList.add(tomato);
        ingredientList.add(oregano);
        ingredientList.add(bellPepper);
        ingredientList.add(pepper);
        ingredientList.add(basil);
        ingredientList.add(water);
    }

    public void printIngredientsList() {
        System.out.println("Ingrediënten:");
        System.out.println(" ");
        for (Ingredient ingredient : ingredientList) {
            System.out.println(ingredient.getAmount() + " " + ingredient.getUnit() + " " + ingredient.getName());
        }
        System.out.println(" ");
    }

    public void printTomatoSoupRecipeSteps() {
        System.out.println("Stappen:");
        System.out.println(" ");
        System.out.println("Snijd de tomaten en paprika in blokjes en voeg ze toe aan de pan op het vuur.");
        System.out.println("Voeg het water toe aan de pan en breng het geheel aan de kook.");
        System.out.println("Kruimel de bouillionblokjes en voeg ze toe aan de pan.");
        System.out.println("Voeg de oregano en de peper toe aan de pan. Laat het geheel nog 5 minuten koken.");
        System.out.println("Haal de pan van het vuur en gebruik een staafmixer om het te pureren");
        System.out.println("Serveer de soep met vers gesneden basilicum");
        System.out.println(" ");
    }
}

