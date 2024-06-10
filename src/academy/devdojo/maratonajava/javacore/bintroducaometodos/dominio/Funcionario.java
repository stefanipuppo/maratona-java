package academy.devdojo.maratonajava.javacore.bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime() {
        System.out.println(nome);
        System.out.println(this.idade);
        for(double salarios: salarios) {
            System.out.println(salarios + " ");
        }
    }

    public void imprimeMediaSalario() {
        double media = 0;
        for(double salarios: salarios) {
            media += salarios;
        }
        media /= salarios.length;
        System.out.println(" Media salarial " + media);
    }
}
