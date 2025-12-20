package com.project.designpatterns.delegation.semdelegation;

public class Conta {
    public Double saldo;
    
    
    public Double converterDolar(){
        return saldo * 3.66;
    }
    
    public Double converterEuro(){
        return saldo * 4.21;
    }
    
    public Double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
