package patterns.decorator.products;

/**
 * Created by pavel on 09.09.16.
 */
public class BlackTea extends ProductBase {


    {
        this.description = "Black tea ";
    }
    @Override
    public double getCost() {
        return 20;
    }

}
