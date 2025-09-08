package GameController;

//Super Classe
public class Personagem {

    //Objeto Personagem (Menina) que possui Nome, Pontuação e idade.
    String nome;
    int idade;
    int pontuacao;

    //Construtor
    public Personagem(String nome, int idade, int pontuacaoInicial){
        this.nome = nome;
        this.idade = idade;
        this.pontuacao = pontuacaoInicial;

    }

    //Encapsulamento:
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getPontuacao() {
        return pontuacao;
    }


}