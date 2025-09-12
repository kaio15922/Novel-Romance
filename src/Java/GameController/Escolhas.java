package GameController;

abstract class Escolhas {

    //Personagem ao qual a escolha vai influenciar. Protected para as classes filhas acessarem
    protected Personagem personagem;
    protected int capitulo;
    protected int posicao;
    protected String texto;
    protected String resposta;

    //Construtor
    public Escolhas(Personagem personagem, int capitulo, int posicao, String texto, String resposta) {
        this.personagem = personagem;
        this.capitulo = capitulo;
        this.posicao = posicao;
        this.texto = texto;
        this.resposta = resposta;
    }

    //Declaração de metodo paras as filhas
    public abstract void pontuar();

    public abstract void imprimir();

    public abstract void responder();
}