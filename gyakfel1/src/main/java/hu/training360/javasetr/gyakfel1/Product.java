package hu.training360.javasetr.gyakfel1;

import java.math.BigDecimal;
import java.util.Objects;

public class Product {
    private String name;
    private BigDecimal unitWeight;
    private int numberOfDecimals;

    public Product(String name, BigDecimal unitWeight, int numberOfDecimals) {
        this.name = name;
        this.unitWeight = unitWeight;
        this.numberOfDecimals = numberOfDecimals;
    }

    public Product(String name, BigDecimal unitWeight) {
        this.name = name;
        this.unitWeight = unitWeight;
        this.numberOfDecimals = 2;
    }

    public BigDecimal totalWeight(int pieces)
    {
        return unitWeight.multiply(new BigDecimal(pieces));
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", unitWeight=" + unitWeight +
                ", numberOfDecimals=" + numberOfDecimals +
                '}';
    }
}
