package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String [] args) {
        //while
        int count = 0;
        while (count < 10) {
            System.out.println(++count);
        }
        
        // do while
        count = 0;
        do {
            System.out.println("dentro do do while" + ++count);
        } while (count < 10);

        // for, a variavel podeser criada dentro ou fora da condição
        for (int i = 0; i < 10; i++) {
            System.out.println("For " +i);
        }

        /* outa forma de ultilizar o for:
        for (count = 0; count < 10; count++) {
            System.out.println("For " +count);

        */


    }
}
