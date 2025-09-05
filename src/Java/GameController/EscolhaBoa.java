package GameController;

public class EscolhaBoa extends Escolhas {

    //Recebendo a menina ao qual a escolha estará ligada
    public EscolhaBoa(Personagem nomeDoPersonagem) {
        super(nomeDoPersonagem);
    }

    @Override
    public void pontuar(){
  
        personagem.pontuacao+= 10;

        System.out.println(personagem.nome + ": Eu te amo! Pontuação atual: " + personagem.pontuacao);
    }    
}