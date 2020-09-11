package hu.training360.javasetr.gyakfel1;

import org.junit.Test;
import java.math.BigDecimal;

public class ProductTest {


    @Test
    public void getTestProduct() {

        Product product = new  Product("Mag", new BigDecimal(10));

        System.out.println(product);
        System.out.println(product.totalWeight(2));

        PackedProduct packedProduct = new PackedProduct("Mag", new BigDecimal(10), 2, 1, new BigDecimal(2));

        System.out.println(packedProduct.totalWeight(2));

    }

}