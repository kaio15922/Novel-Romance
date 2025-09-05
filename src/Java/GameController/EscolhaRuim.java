package GameController;

public class EscolhaRuim extends Escolhas {
  
    public EscolhaRuim(Personagem nomeDoPersonagem) {
        super(nomeDoPersonagem);
    }

    @Override
    public void pontuar(){
  
        personagem.pontuacao+= -10;

        System.out.println(personagem.nome + ": Eu te odeio! Pontuação atual: " + personagem.pontuacao);
    }   
}