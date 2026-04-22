
import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private double currentPrice;
    private PriceUpdateStrategy strategy;

    public Company(String name, double initialPrice, PriceUpdateStrategy strategy) {
        this.name = name;
        this.currentPrice = initialPrice;
        this.strategy = strategy;
    }

    public void updatePrice() {
        this.currentPrice = strategy.calculateNewPrice(this.currentPrice);
    }

    // Getters
    public String getName() { return name; }
    public double getCurrentPrice() { return currentPrice; }
}