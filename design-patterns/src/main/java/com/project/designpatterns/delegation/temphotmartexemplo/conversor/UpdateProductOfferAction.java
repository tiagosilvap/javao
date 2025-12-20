package com.project.designpatterns.delegation.temphotmartexemplo.conversor;

import com.project.designpatterns.delegation.temphotmartexemplo.vo.OfferVO;

public class UpdateProductOfferAction implements Action {
    @Override
    public Double execute(OfferVO offerVO) {
        return 1.0;
    }
}
