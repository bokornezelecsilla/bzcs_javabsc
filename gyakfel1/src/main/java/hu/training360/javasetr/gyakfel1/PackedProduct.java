package hu.training360.javasetr.gyakfel1;

import java.math.BigDecimal;

public class PackedProduct extends Product{
    private int packingUnit;
    private BigDecimal weighthOfBox;


    public PackedProduct(String name, BigDecimal unitWeight, int numberOfDecimals, int packingUnit, BigDecimal weighthOfBox) {
        super(name, unitWeight, numberOfDecimals);
        this.packingUnit = packingUnit;
        this.weighthOfBox = weighthOfBox;
    }

    public BigDecimal totalWeight(int pieces)
    {
        BigDecimal ret = super.totalWeight(pieces);
        BigDecimal bigPieces  = new BigDecimal(pieces);
        ret = ret.multiply(bigPieces);
        return ret;
    }
}
