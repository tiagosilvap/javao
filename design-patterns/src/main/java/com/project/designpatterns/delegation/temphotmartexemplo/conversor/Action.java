package com.project.designpatterns.delegation.temphotmartexemplo.conversor;

import com.project.designpatterns.delegation.temphotmartexemplo.vo.OfferVO;


public interface Action {
    Double execute(OfferVO offerVO);
}
