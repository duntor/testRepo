package patterns.decorator.products;

/**
 * Created by pavel on 09.09.16.
 */
public class Espresso extends ProductBase {
    {
        this.description = "Espresso ";
    }

    @Override
    public double getCost() {
        return 50;
    }
}