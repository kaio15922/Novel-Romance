package GameController;
import java.util.*;

//Super Classe
public abstract class Personagem{

    /*Objeto Personagem (Menina) que possui Nome, Pontuação, idade e Capitulo
    (Ao meu ver algumas conquistas so vao ser possiveis em certos capitulos)*/
    protected String nome;
    protected int idade;
    protected int pontuacao;
    protected int capitulo;

    //Construtor
    public Personagem(String nome, int idade, int pontuacaoInicial, int capitulo){
        this.nome = nome;
        this.idade = idade;
        this.pontuacao = pontuacaoInicial;
        this.capitulo = capitulo;

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

    //Esse set eh diferente pq a gente so chama ele na main e ele Avanca um capitulo.
    public void setCapitulo() {
        this.capitulo += 1;
    }

    public int getCapitulo() {
        return this.capitulo;
    }

    //Metodo abstrato que vai verificar se o jogador pode desbloquear alguma conquista:
    public abstract void VerifcaConquistas(List<String> conquistas);
}