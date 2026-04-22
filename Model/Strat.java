public interface PriceUpdateStrategy {
    double calculateNewPrice(double currentPrice);
}

public class MarketStrategy implements PriceUpdateStrategy {
    @Override
    public double calculateNewPrice(double currentPrice) {
        // Random change between -10% and +10%
        double change = (Math.random() * 0.2) - 0.1;
        return currentPrice * (1 + change);
    }
}