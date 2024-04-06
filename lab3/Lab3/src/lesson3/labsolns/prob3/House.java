package lesson3.labsolns.prob3;


public class House extends Property {
    private final double lotSize;

    public House(Address address, double lotSize) {
        super(address);
        this.lotSize = lotSize;
    }

    @Override
    public double computeRent() {
        return 0.1 * lotSize;
    }
}
