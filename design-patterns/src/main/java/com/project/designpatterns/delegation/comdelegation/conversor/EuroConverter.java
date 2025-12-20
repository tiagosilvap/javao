package com.project.designpatterns.delegation.comdelegation.conversor;

public class EuroConverter implements Conversor {
    public Double converter(Double valor) {
        return valor * 4.21;
    }
}
