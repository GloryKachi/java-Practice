package myOopDesigns;

public class HealthyBurger extends BaseHamburger{
private int cabbage;
private int fish;


    public HealthyBurger(int cabbage,int fish) {
        super("Healthy Burger", "Brown rye bread roll", true, 500);
        this.cabbage = cabbage;
        this.fish = fish;
    }

    @Override
    public int calculateBasePrice() {
        return super.calculateBasePrice();
    }

    @Override
    public int calculateAdditionalItems() {

        return super.calculateAdditionalItems();
    }

    @Override
    public int calculateFinalPrice() {
        return super.calculateFinalPrice();
    }
}
