package patterns.decorator.products.ingredients;

import patterns.decorator.products.ProductBase;

/**
 * Created by pavel on 09.09.16.
 */
public class SugarIngredient extends IngredientsDecoratorBase{

    private ProductBase product;

    public SugarIngredient(ProductBase product){
        this.product = product;
        description = this.product.getDescription()+"+Sugar ";
    }


    @Override
    public double getCost() {
        return product.getCost()+15.0;
    }
}
