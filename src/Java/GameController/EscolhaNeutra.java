package GameController;

public class EscolhaNeutra extends Escolhas {
  

    public EscolhaNeutra(Personagem personagem, int capitulo, int posicao, String texto, String resposta) {
        super(personagem, capitulo, posicao, texto, resposta);
    }

    @Override
    public void pontuar(){

        int pont = personagem.getPontuacao();
        pont += 2;
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