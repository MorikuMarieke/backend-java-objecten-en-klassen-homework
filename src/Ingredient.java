public class Ingredient {

    private String unit;
    private String name;
    private double amount;

    // This is the empty constructor for Ingredient

    public Ingredient() {
    }

    // This is the constructor for Ingredient

    public Ingredient(String name, String unit, double amount) {
        this.unit = unit;
        this.name = name;
        this.amount = amount;
    }

    // Getters and Setters for properties of Ingredient

    public double getAmount() {
        return amount;
    }

    public String getUnit() {
        return unit;
    }

    public String getName() {
        return name;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setName(String name) {
        this.name = name;
    }

}
