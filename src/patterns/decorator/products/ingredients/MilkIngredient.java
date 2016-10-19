package patterns.decorator.products.ingredients;

import patterns.decorator.products.ProductBase;

/**
 * Created by pavel on 09.09.16.
 */
public class MilkIngredient extends IngredientsDecoratorBase{

    private ProductBase product;

    public MilkIngredient (ProductBase product){
        this.product = product;
        description = this.product.getDescription()+"+Milk ";
    }


    @Override
    public double getCost() {
        return product.getCost()+50.0;
    }
}
