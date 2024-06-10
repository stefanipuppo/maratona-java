package academy.devdojo.maratonajava.javacore.bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.bintroducaometodos.dominio.Funcionario;

public class FuncinarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Stefani";
        funcionario.idade = 25;
        funcionario.salarios = new double[] {1200, 1500, 2000};

        funcionario.imprime();
        funcionario.imprimeMediaSalario();;
    }
}
