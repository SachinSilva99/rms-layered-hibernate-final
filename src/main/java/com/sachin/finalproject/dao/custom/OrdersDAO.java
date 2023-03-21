package com.sachin.finalproject.dao.custom;

import com.sachin.finalproject.dao.CrudDAO;
import com.sachin.finalproject.entity.Orders;

import java.util.Optional;

public interface OrdersDAO extends CrudDAO<Orders, String> {
    Optional<String> getLastOrderId();
}
