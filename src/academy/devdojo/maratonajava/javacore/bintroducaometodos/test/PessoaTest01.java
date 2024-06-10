package academy.devdojo.maratonajava.javacore.bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main (String[] args) {
        Pessoa pessoa = new Pessoa();
//      pessoa.nome = "Jiraya"
        pessoa.setNome("\nJiraya");
        pessoa.setIdade(25);
//      pessoa.imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

    }
    
}