package com.project.designpatterns.chainofresponsability.meu_exemplo.middleware;

import java.math.BigDecimal;


public abstract class Middleware {
    private Middleware next;

    public Middleware linkWith(Middleware next) {
        this.next = next;
        return next;
    }

    protected BigDecimal checkNext(BigDecimal value1, BigDecimal offerPrice) {
        if (next == null) {
            return offerPrice;
        }
        return next.getPurchaseValue(value1, offerPrice);
    }

    public abstract BigDecimal getPurchaseValue(BigDecimal value1, BigDecimal offerPrice);
}
