package GameController;

public class MainTeste {
    public static void main(String[] args) {

        //Usando construtor para fazer uma menina de teste
        Personagem Sakura = new Personagem("Sakura", 100);

        //Usando construtor para simular interações. Sakura é a personagem que elas estão ligadas
        Escolhas interacaoX = new EscolhaBoa(Sakura);
        Escolhas interacaoY = new EscolhaRuim(Sakura);
        Escolhas interacaoZ = new EscolhaNeutra(Sakura);

        //Testando as funções
        interacaoX.pontuar();
        interacaoY.pontuar();
        interacaoZ.pontuar();
    }
}