package service;

import model.Funcionario;
import model.Programador;

public class Desenvolvedor extends Funcionario implements Programador {
    public Desenvolvedor(String nome) {
        super(nome,"Desenvolvedor");
    }

    @Override
    public void programar() {
        System.out.println(getNome() + "está programando.");

    }
}
