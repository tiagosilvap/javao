package com.project.designpatterns.delegation.temphotmartexemplo.conversor;

import java.util.HashMap;
import java.util.Map;

import static com.project.designpatterns.delegation.temphotmartexemplo.ActionEnum.UPDATE;
import static com.project.designpatterns.delegation.temphotmartexemplo.ActionEnum.UPDATE_SMART_RECOVERY;

public class Factory {
    
    private final Map<String, Action> factoryMap;
    
    public Factory() {
        factoryMap = new HashMap<>();
        factoryMap.put(UPDATE_SMART_RECOVERY.actionName, new UpdateSmartRecoveryAction());
        factoryMap.put(UPDATE.actionName, new UpdateProductOfferAction());
    }
    
    public Action getAction(String actionEnum) {
        return factoryMap.get(actionEnum);
    }
}
