package com.project.designpatterns.chainofresponsability.meu_exemplo.middleware;

import java.math.BigDecimal;

/**
 * ConcreteHandler. Checks a user's role.
 */
public class RoleCheckMiddleware extends Middleware {

    public BigDecimal getPurchaseValue(BigDecimal payloadPrice, BigDecimal offerPrice) {
        if (true) {
            return BigDecimal.TEN;
        }
        return checkNext(payloadPrice, offerPrice);
    }
}
