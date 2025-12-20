package com.project.designpatterns.delegation.temphotmartexemplo;

public enum ActionEnum {
    UPDATE("update"),
    UPDATE_SMART_RECOVERY("update_smart_recovery");
    
    public final String actionName;
    
    ActionEnum(String actionName) {
        this.actionName = actionName;
    }
    
    public String getActionName() {
        return this.actionName;
    }
}
