package co.com.reactive.model.dlsmodel.purchasedliquor.purchase;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class LiquorProduct {
    private String idProduct;
    private String amount;
    private double value;
    private double priceSell;
    private double discount;
    private double discountPercent;
    private String type;
    private String size;
    private String color;
    private String degressAlcohol;
    private boolean isSweet;
    private String comesFrom;
}
