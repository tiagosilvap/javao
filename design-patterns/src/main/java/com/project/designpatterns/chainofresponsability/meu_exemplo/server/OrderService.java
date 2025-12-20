package com.project.designpatterns.chainofresponsability.meu_exemplo.server;

import com.project.designpatterns.chainofresponsability.meu_exemplo.middleware.Middleware;

import java.math.BigDecimal;

/**
 * Server class.
 */
public class OrderService {

    public BigDecimal obterValorDaCompra(Middleware middleware, BigDecimal payloadPrice, BigDecimal offerPrice) {
        return middleware.getPurchaseValue(payloadPrice, offerPrice);
    }

}
