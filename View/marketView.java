public interface MarketObserver {
    void onMarketUpdate(List<Company> companies, int day, double playerCash);
}

public class MarketSimulator {
    private List<Company> companies = new ArrayList<>();
    private List<MarketObserver> observers = new ArrayList<>();
    private int currentDay = 1;

    public void addObserver(MarketObserver observer) {
        observers.add(observer);
    }

    public void nextDay() {
        if (currentDay < 30) {
            for (Company c : companies) {
                c.updatePrice();
            }
            currentDay++;
            notifyObservers();
        }
    }

    private void notifyObservers() {
        for (MarketObserver o : observers) {
            // In a real app, you'd pass the player's cash here too
            o.onMarketUpdate(companies, currentDay, 100000.0);
        }
    }
}