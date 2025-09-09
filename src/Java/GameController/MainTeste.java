package GameController;
import java.util.Scanner;

public class MainTeste extends Sakura {
    public static void main(String[] args) {

        /*Usando construtor para fazer uma menina de teste
        *Um personagem pode ser instanciado como seu filho.
        * Mas o contrario eh impossivel.*/
        Personagem sakura = new Sakura();

        //Falas do capitulo
        String[] capitulo = new String[2];
        capitulo[0] = "Ola protagonista";
        capitulo[1] = "De qualquer forma, pipipi popopo";

        Escolhas[][] escolhasCap1 = new Escolhas[1][3];

        //Usando construtor para simular interações. Sakura é a personagem que elas estão ligadas
        escolhasCap1[0][0] = new EscolhaBoa(sakura, 1, 1, "1. Eu te amo", "Não ligo");
        escolhasCap1[0][1] = new EscolhaRuim(sakura, 1, 1, "2. Cala a boca", "Sucumba!");
        escolhasCap1[0][2] = new EscolhaNeutra(sakura, 1, 1, "3. Oi","Bobão");

        Player(capitulo, escolhasCap1);

    }

    public static void Player(String capitulo[], Escolhas[][] escolhasCap){

        for(int i = 0; i < capitulo.length; i++){

            //Imprime dialogo
            System.out.println(capitulo[i]);

            //Imprime respostas do jogador
            escolhasCap[i][0].imprimir();
            escolhasCap[i][1].imprimir();
            escolhasCap[i][2].imprimir();

            //Pegando a escolha do jogador
            Scanner scanner = new Scanner(System.in);
            int j = scanner.nextInt();

            //Imprime a reação da personagem
            escolhasCap[i][j-1].responder();

        }

    }
}