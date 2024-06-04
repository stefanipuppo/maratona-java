package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        
        if(isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcólica");
        } else {
            System.out.println("Não é autorizado a comprar bebida alcólica");
        }
        


        // Para negar algo se ultiliza o sinal exclamação !, == false ou else
        if(!isAutorizadoComprarBebida) {
            System.out.println("Não é autorizado a comprar bebida alcólica");


        }
    }
}


        /*
        Apenas uma forma diferente de fazer, contem o mesmo resultado que o de baixo.

        int idade = 20;
        if(idade >= 18) { // Só retorna boolean, e só executa se for verdade, falso nao excuta nada
            System.out.println("Autorizado a comprar bebida alcólica");
        }
        */