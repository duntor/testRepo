package patterns.decorator.products;

/**
 * Created by pavel on 09.09.16.
 */
public class Capuccino extends ProductBase {

    {
        this.description = "Capuccino ";
    }


    @Override
    public double getCost() {
        return 75;
    }
}
