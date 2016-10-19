package patterns.decorator.products;

/**
 * Created by pavel on 09.09.16.
 */
public class HotChocolate extends ProductBase {

    {
        this.description = "Hot chocolate";
    }
    @Override
    public double getCost() {
        return 100;
    }
}
