package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
        /*  Dado um determinado salário, qual o valor de imposto tenho que pagar?
            De 0 até 34.712 tem que pagar 9.70%
            De 34.713 até 68.507 tem que pagar 37.35%
            De 68.508 para cima tem que pagar 49.50%
        */
        
        public static void main(String[] args) {
            double salarioAnual = 70000;
            double primeiraFaixa = 9.70 / 100;
            double segundaFaixa = 37.35 / 100;
            double terceiraFaixa = 49.50 / 100;
            double valorImposto;
            if(salarioAnual <= 34712) {
                valorImposto = salarioAnual * primeiraFaixa;
            } else if (salarioAnual >= 34713 && salarioAnual <= 68507){
                valorImposto = salarioAnual * segundaFaixa;
            } else {
                valorImposto = salarioAnual * terceiraFaixa;
            }
            System.out.println(valorImposto);
        }
}
