package com.project.designpatterns.delegation.semdelegation;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setSaldo(10.0);
        Double valorConvertido = realizarConversaoDeSaldo(conta, Moeda.DOLAR);
        System.out.println(valorConvertido);
    }
    
    public static Double realizarConversaoDeSaldo(Conta conta, Moeda moeda) {
        if(moeda.equals(Moeda.EURO)) {
            return conta.converterEuro();
        }
        if(moeda.equals(Moeda.DOLAR)) {
            return conta.converterDolar();
        }
        return null;
    }
}
