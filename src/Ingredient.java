public class Ingredient {

    private String unit;
    private String name;
    private double amount;

    public Ingredient() {
    }
// This is the empty constructor for Ingredient

    public Ingredient(String name, String unit, double amount) {
        this.unit = unit;
        this.name = name;
        this.amount = amount;
    }

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
