package main;

import model.Atendente;
import model.Programador;
import service.AtendenteBanco;
import service.Desenvolvedor;

public class Main {
    public static void main(String[] args) {
        Programador desenvolvedor = new Desenvolvedor();
        desenvolvedor.programar();
        Atendente atendente = new AtendenteBanco();
        atendente.atenderCliente();
    }
}