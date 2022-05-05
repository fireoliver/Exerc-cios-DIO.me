package one.digitalinnovation.basecamp;

import static one.digitalinnovation.basecamp.Mensagem.obtermensagem;

public class Main {

    public static void main(String[] args) {

        //Calculadora
        System.out.println("Exercício calculadora");
        calculadora.soma(2, 4);
        calculadora.subtracao(9, 3);
        calculadora.multiplicacao(3, 4);
        calculadora.divisao(5, 2.5);

        //Mensagem
        System.out.println("Exercício mensagem");
        Mensagem.obtermensagem(8);
        Mensagem.obtermensagem(13);
        Mensagem.obtermensagem(21);

        //Empréstimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
        
    }
}
