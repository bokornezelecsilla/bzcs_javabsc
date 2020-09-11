package hu.training360.javasetr.gyakfel1;

import org.junit.Test;
import java.math.BigDecimal;

public class ProductTest {


    @Test
    public void getTestProduct() {
        Product product;
        product = new Product("Mag", new BigDecimal(10));
        System.out.println(product);
        System.out.println(product.totalWeight(2));


    }

}