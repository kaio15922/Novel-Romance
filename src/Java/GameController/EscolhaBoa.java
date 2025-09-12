package GameController;

public class EscolhaBoa extends Escolhas {

    //Recebendo a menina ao qual a escolha estará ligada
    public EscolhaBoa(Personagem personagem, int capitulo, int posicao, String texto, String resposta) {
        super(personagem, capitulo, posicao, texto, resposta);
        
    }

    @Override
    public void pontuar(){
  
        personagem.pontuacao+= 10;

    }
    
    @Override
    public void imprimir(){

        System.out.println(this.texto);

    }

    @Override
    public void responder(){

        System.out.println(this.resposta + "\n");

    }
}