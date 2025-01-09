package main;

import service.AtendenteBanco;
import service.Desenvolvedor;

public class Main {
    public static void main(String[] args) {
        // Criando um Desenvolvedor
        Desenvolvedor desenvolvedor = new Desenvolvedor("João ");
        System.out.println("Funcionário: " + desenvolvedor.getNome());
        System.out.println("Cargo: " + desenvolvedor.getCargo());
        desenvolvedor.programar();
        System.out.println();

        // Criando um Atendente
        AtendenteBanco atendente = new AtendenteBanco("Maria ");
        System.out.println("Funcionário: " + atendente.getNome());
        System.out.println("Cargo: " + atendente.getCargo());
        atendente.atenderCliente();
    }
}
