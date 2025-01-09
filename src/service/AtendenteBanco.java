package service;

import model.Atendente;
import model.Funcionario;

public class AtendenteBanco extends Funcionario implements Atendente {
    public AtendenteBanco(String nome) {
        super(nome,"Atendente");
    }

    @Override
    public void atenderCliente() {
        System.out.println(getNome() + "está atendendo cliente.");

    }
}
