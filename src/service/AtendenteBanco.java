package service;

import model.Atendente;

public class AtendenteBanco implements Atendente {
    @Override
    public void atenderCliente() {
        System.out.println("Atendendo cliente.");

    }
}
