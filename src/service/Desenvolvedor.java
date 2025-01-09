package service;

import model.Programador;

public class Desenvolvedor implements Programador {
    @Override
    public void programar() {
        System.out.println("Programando.");

    }
}
