package GameController;

public class EscolhaNeutra extends Escolhas {
  
    public EscolhaNeutra(Personagem nomeDoPersonagem) {
        super(nomeDoPersonagem);
    }

    @Override
    public void pontuar(){

        System.out.println(personagem.nome + ": Legal. Pontuação atual: " + personagem.pontuacao);
    } 
}