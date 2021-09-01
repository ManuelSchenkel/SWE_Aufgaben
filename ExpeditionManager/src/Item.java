public class Item {
    private String name;
    private int weight;
    private int profit;

    public Item(String name, int weight, int profit) {
        this.name = name;
        this.weight = weight;
        this.profit = profit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getProfit() {
        return profit;
    }

    public String toString() {
        return "Name: " + this.name + ", Gewicht: " + this.weight + ", Profit: " + this.profit;
    }


}
