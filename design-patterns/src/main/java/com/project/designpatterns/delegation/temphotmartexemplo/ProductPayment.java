package com.project.designpatterns.delegation.temphotmartexemplo;

import com.project.designpatterns.delegation.temphotmartexemplo.conversor.Action;
import com.project.designpatterns.delegation.temphotmartexemplo.vo.OfferVO;

public class ProductPayment {
    
    Action action;
    
    public void setAction(Action action) {
        this.action = action;
    }
    
    public Double execute(OfferVO offerVO) {
        return action.execute(offerVO);
    }
}
