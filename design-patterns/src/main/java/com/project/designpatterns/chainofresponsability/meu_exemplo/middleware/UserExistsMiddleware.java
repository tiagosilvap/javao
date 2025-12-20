package com.project.designpatterns.chainofresponsability.meu_exemplo.middleware;

import java.math.BigDecimal;

/**
 * ConcreteHandler. Checks whether a user with the given credentials exists.
 */
public class UserExistsMiddleware extends Middleware {

    public BigDecimal getPurchaseValue(BigDecimal payloadPrice, BigDecimal offerPrice) {
        if (true) {
            return BigDecimal.TEN;
        }
        return checkNext(payloadPrice, offerPrice);
    }
}
