# Exercícios para praticar SOLID!

## Exercício 4: Interface Segregation Principle (ISP)

### Enunciado:
Você está desenvolvendo um sistema para gerenciar funcionários de um banco. Atualmente, a interface Funcionario força todos os funcionários a implementarem métodos que nem todos utilizam. Refatore o código para que ele siga o Princípio da Segregação de Interfaces (ISP).

Código inicial (errado):
```java
public interface Funcionario {
    void programar();
    void atenderCliente();
}

public class Desenvolvedor implements Funcionario {
    public void programar() {
        System.out.println("Programando...");
    }

    public void atenderCliente() {
        // Não faz sentido para um desenvolvedor
    }
}

public class Atendente implements Funcionario {
    public void programar() {
        // Não faz sentido para um atendente
    }

    public void atenderCliente() {
        System.out.println("Atendendo cliente...");
    }
}
```

### Tarefa:
- Separe a interface Funcionario em interfaces menores, como Programador e Atendente.
- Faça com que cada classe implemente apenas a interface que faz sentido para ela.

## Resolução
O Princípio de Segregação de Interface (ISP) sugere que uma classe não deve ser forçada a implementar métodos dos quais não precisa. Em outras palavras, uma classe deve ter interfaces pequenas e focadas em vez de grandes e monolíticas.

- Inteface Atendente

```java
package model;

public interface Atendente {
    void atenderCliente();
}
```
- Interface Programador

```java
package model;

public interface Programador {
    void programar();
}
```
- Classe abstrata Funcionario

```java
package model;

public abstract class Funcionario {
    private String nome;
    private String cargo;

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }
}
```
- Classe AtendenteBanco

```java
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
```
- Desenvolverdor

```java
package service;

import model.Funcionario;
import model.Programador;

public class Desenvolvedor extends Funcionario implements Programador {
    public Desenvolvedor(String nome) {
        super(nome, "Desenvolvedor");
    }

    @Override
    public void programar() {
        System.out.println(getNome() + "está programando.");

    }
}
```
## Conclusão
O código aplica o Princípio da Segregação de Interfaces (ISP) ao dividir responsabilidades específicas em interfaces menores (Programador e Atendente), evitando métodos desnecessários. A classe abstrata Funcionario fornece atributos genéricos, enquanto as subclasses Desenvolvedor e AtendenteBanco implementam apenas as interfaces relevantes. Isso garante alta coesão e baixo acoplamento, facilitando a manutenção e extensibilidade do sistema. Novos tipos de funcionários podem ser adicionados sem impactar o código existente.