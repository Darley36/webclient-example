package co.com.reactive.model.dlsmodel.purchasedliquor.purchase;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder(toBuilder = true)
public class LiquorOder {
    private final String supplierCompany;
    private final String idCompany;
    private final String providerName;
    private final String idProvider;
    private final String phone;
    private final String email;
    private final String idProduct;
    private final double amount;
    private final double value;
    private final String type;
    private final double IVA;
    private final double discount;
    private final double discountPercent;
    private final double totalValue;
    private final boolean inShop;
    private final String productStatus;
    private final Date dateBuy;
}
