package patterns.decorator.products.ingredients;

import patterns.decorator.products.ProductBase;

/**
 * Created by pavel on 09.09.16.
 */
public class ChocolateIngredient extends IngredientsDecoratorBase{

    private ProductBase product;

    public ChocolateIngredient(ProductBase product){
        this.product = product;
        description = this.product.getDescription()+"+Chocolate ";
    }


    @Override
    public double getCost() {
        return product.getCost()+75.0;
    }
}
