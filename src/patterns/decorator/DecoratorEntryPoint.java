package patterns.decorator;

import patterns.EntryPoint;
import patterns.decorator.products.Espresso;
import patterns.decorator.products.ProductBase;
import patterns.decorator.products.ingredients.MilkIngredient;
import patterns.decorator.products.ingredients.SugarIngredient;

/**
 * Created by pavel on 09.09.16.
 */
public class DecoratorEntryPoint implements EntryPoint {
    @Override
    public void runExample() {
        ProductBase cappucino = new SugarIngredient(new MilkIngredient(new Espresso()));
        System.out.println(cappucino.getDescription());
        System.out.println("Price is "+cappucino.getCost());
    }
}
