package academy.devdojo.maratonajava.javacore.dconstrutores.Test;

import academy.devdojo.maratonajava.javacore.dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Akudama", "TV", 12, "ação", "Producion IG");
        anime.imprime();

    }
}