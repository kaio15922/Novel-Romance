package GameController;

public class MainTeste {
    public static void main(String[] args) {

        /*Usando construtor para fazer uma menina de teste
        *Um personagem pode ser instanciado como seu filho.
        * Mas o contrario eh impossivel.*/
        Personagem sakura = new Sakura();

        //Usando construtor para simular interações. Sakura é a personagem que elas estão ligadas
        Escolhas interacaoX = new EscolhaBoa(sakura);
        Escolhas interacaoY = new EscolhaRuim(sakura);
        Escolhas interacaoZ = new EscolhaNeutra(sakura);

        //Testando as funções
        interacaoX.pontuar();
        interacaoY.pontuar();
        interacaoZ.pontuar();
    }
}