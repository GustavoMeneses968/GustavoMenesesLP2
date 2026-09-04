package model;
public class Personagem {
    String nome;
    String classe;
    String nivelDeDificuldade;
    String[] habilidades = new String[2];
    int nivelInicial;
    public Personagem(String nome, String classe, String nivelDeDificuldade, String[] habilidades, int nivelInicial) {
        this.nome = nome;
        this.classe = classe;
        this.nivelDeDificuldade = nivelDeDificuldade;
        this.habilidades = habilidades;
        this.nivelInicial = nivelInicial;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getClasse() {
        return classe;
    }
    public void setClasse(String classe) {
        this.classe = classe;
    }
    public String getNivelDeDificuldade() {
        return nivelDeDificuldade;
    }
    public void setNivelDeDificuldade(String nivelDeDificuldade) {
        this.nivelDeDificuldade = nivelDeDificuldade;
    }
    public String[] getHabilidades() {
        return habilidades;
    }
    public void setHabilidades(String[] habilidades) {
        this.habilidades = habilidades;
    }
    public int getNivelInicial() {
        return nivelInicial;
    }
    public void setNivelInicial(int nivelInicial) {
        this.nivelInicial = nivelInicial;
    }

}
