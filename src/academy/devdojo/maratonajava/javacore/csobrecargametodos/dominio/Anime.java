package academy.devdojo.maratonajava.javacore.csobrecargametodos.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    public void init(String nome, String tipo, int episodios){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        
    }

/*      outra  forma de usar 

        public void init(String nome, String tipo, int episodios){
        this.init(nome, tipo, episodios);
        this.genero = genero;
    
 */

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero(String genero) {
        return this.genero;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome(String nome) {
        return this.nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setEpisodio(int episodios) {
        this.episodios = episodios;
    }

    public int getEspisodios() {
        return this.episodios;
    }
}
