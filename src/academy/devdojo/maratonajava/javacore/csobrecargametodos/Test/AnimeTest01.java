package academy.devdojo.maratonajava.javacore.csobrecargametodos.Test;

import academy.devdojo.maratonajava.javacore.csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        
        anime.init("Akudama", "TV", 12);
        anime.imprime();
        // forma abreviada de uso, mesmo resultado que o exemplo abaixo
    
 //outra forma de usar
 
 /*      anime.setNome("Akudama Drive");
        anime.setTipo("TV");
        anime.setEpisodio(12);
        anime.setGenero("ação");
        anime.imprime();

 */

    }
}