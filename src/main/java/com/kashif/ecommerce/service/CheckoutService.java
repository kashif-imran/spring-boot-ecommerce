package com.kashif.ecommerce.service;

import com.kashif.ecommerce.dto.Purchase;
import com.kashif.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
