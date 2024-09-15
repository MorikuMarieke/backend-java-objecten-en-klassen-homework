public class ApplePieRecipe {

    Ingredient butter = new Ingredient("Ongezouten Boter", "gram", 200);
    Ingredient whiteSugar = new Ingredient("Witte Basterdsuiker", "gram", 200);
    Ingredient flour = new Ingredient("Zelfrijzend Bakmeel", "gram", 400);
    Ingredient egg = new Ingredient("Ei", "stuk", 1);
    Ingredient vanillaSugar = new Ingredient("Vanille Suiker", "gram", 8);
    Ingredient salt = new Ingredient("Zout", "snufje", 1);
    Ingredient apple = new Ingredient("Zoetzure Appels", "kilo", 1.5);
    Ingredient crystalSugar = new Ingredient("Kristalsuiker", "gram", 75);
    Ingredient cinnamon = new Ingredient("Kaneel", "theelepels", 3);
    Ingredient breadcrumbs = new Ingredient("Paneermeel", "gram", 15);

    public void printIngredients() {
        System.out.println("Ingrediënten:");
        System.out.println(" ");
//      In the README file there is a typo in this line, one " too many before ingredient.getAmount.
        System.out.println(butter.getAmount() + " " + butter.getUnit() + " " + butter.getName());
        System.out.println(whiteSugar.getAmount() + " " + whiteSugar.getUnit() + " " + whiteSugar.getName());
        System.out.println(flour.getAmount() + " " + flour.getUnit() + " " + flour.getName());
        System.out.println(egg.getAmount() + " " + egg.getUnit() + " " + egg.getName());
        System.out.println(vanillaSugar.getAmount() + " " + vanillaSugar.getUnit() + " " + vanillaSugar.getName());
        System.out.println(salt.getAmount() + " " + salt.getUnit() + " " + salt.getName());
        System.out.println(apple.getAmount() + " " + apple.getUnit() + " " + apple.getName());
        System.out.println(crystalSugar.getAmount() + " " + crystalSugar.getUnit() + " " + crystalSugar.getName());
        System.out.println(cinnamon.getAmount() + " " + cinnamon.getUnit() + " " + cinnamon.getName());
        System.out.println(breadcrumbs.getAmount() + " " + breadcrumbs.getUnit() + " " + breadcrumbs.getName());
        System.out.println(" ");
    }

    public void printApplepieRecipeSteps() {
        System.out.println("Stappen:");
        System.out.println(" ");
        System.out.println("Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
        System.out.println("Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
        System.out.println("Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
        System.out.println("Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
        System.out.println("Vet de springvorm in en bestrooi deze met bloem");
        System.out.println("Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
        System.out.println("Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
        System.out.println("Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
        System.out.println("Leg de stroken kruislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken");
        System.out.println("Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");
        System.out.println(" ");
    }

    public void heatOven() {
        System.out.println("Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
    }

    public void separateEgg() {
        System.out.println("Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
    }

    public void combineDoughIngredients() {
        System.out.println("Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
    }

    public void prepareAppleFilling() {
        System.out.println("Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
    }

    public void greaseForm() {
        System.out.println("Vet de springvorm in en bestrooi deze met bloem");
    }

    public void addDoughToForm() {
        System.out.println("Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
    }

    public void addFillingToForm() {
        System.out.println("Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
    }

    public void prepareTopDough() {
        System.out.println("Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
    }

    public void addTopDoughToForm() {
        System.out.println("Leg de stroken kruislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken");
    }

    public void bakePie() {
        System.out.println("Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");
    }

}

