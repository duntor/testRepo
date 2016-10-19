package patterns.decorator.products;

/**
 * Created by pavel on 09.09.16.
 */
public abstract class ProductBase {

    protected String description = "";


    public String getDescription(){
        return description;
    }

    public abstract double getCost();


}
