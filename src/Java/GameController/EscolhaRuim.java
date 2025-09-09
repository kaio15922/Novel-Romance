package GameController;

public class EscolhaRuim extends Escolhas {
  
    public EscolhaRuim(Personagem personagem, int capitulo, int posicao, String texto, String resposta) {
        super(personagem, capitulo, posicao, texto, resposta);

        this.capitulo = capitulo;
        this.posicao = posicao;
        this.texto = texto;
        this.resposta = resposta;
    }

    @Override
    public void pontuar(){
  
        personagem.pontuacao+= -10;

    }   

    @Override
    public void imprimir(){

        System.out.println(this.texto);

    }

        @Override
    public void responder(){

        System.out.println(this.resposta);

    }
}