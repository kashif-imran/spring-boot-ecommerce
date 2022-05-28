package com.kashif.ecommerce.dto;

import com.kashif.ecommerce.entity.Address;
import com.kashif.ecommerce.entity.Customer;
import com.kashif.ecommerce.entity.Order;
import com.kashif.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
