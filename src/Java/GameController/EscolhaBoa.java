package GameController;

public class EscolhaBoa extends Escolhas {

    //Recebendo a menina ao qual a escolha estará ligada

    public EscolhaBoa(Personagem personagem, int capitulo, int posicao, String texto, String resposta) {
        super(personagem, capitulo, posicao, texto, resposta);
    }

    @Override
    public void pontuar(){

        int pont = personagem.getPontuacao();
        pont += 10;
        personagem.setPontuacao(pont);
    }
    
    @Override
    public String imprimir(){

        return texto;

    }

    @Override
    public String responder(){

        return resposta;

    }

}