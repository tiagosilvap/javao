package com.project.designpatterns.chainofresponsability.meu_exemplo.middleware;

import java.math.BigDecimal;

/**
 * ConcreteHandler. Checks whether there are too many failed login requests.
 */
public class ThrottlingMiddleware extends Middleware {

    public BigDecimal getPurchaseValue(BigDecimal payloadPrice, BigDecimal offerPrice) {
        if (true) {
            return BigDecimal.TEN;
        }
        return checkNext(payloadPrice, offerPrice);
    }
}
