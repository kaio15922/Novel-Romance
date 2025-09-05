package GameController;

abstract class Escolhas {

    //Personagem ao qual a escolha vai influenciar. Protected para as classes filhas acessarem
    protected Personagem personagem;

    //Parte que liga uma PersonagemX para uma EscolhaY
    public Escolhas(Personagem nomeDoPersonagem) {
        this.personagem = nomeDoPersonagem;
    }

    //Declaração de metodo paras as filhas
    public abstract void pontuar();

}