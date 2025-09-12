package GameController;
import java.util.*;

public class MainTeste extends Sakura {
    public static void main(String[] args) {

        /*Usando construtor para fazer uma menina de teste
        *Um personagem pode ser instanciado como seu filho.
        * Mas o contrario eh impossivel.*/
        Personagem sakura = new Sakura();

        //Criando arrayList para armazenar as conquistas obtidas:
        List<String> conquistas = new ArrayList<String>();

        //ArrayList que contem as personagens do jogo:
        List<Personagem> personagems = new ArrayList<Personagem>();
        
        //Adicionando as personagens no ArrayList:
        personagems.add(sakura);

        //Falas do capitulo
        String[] capitulo1 = new String[2];
        capitulo1[0] = "Ola protagonista";
        capitulo1[1] = "De qualquer forma, pipipi popopo";

        Escolhas[][] escolhasCap1 = new Escolhas[2][3];

        //Usando construtor para simular interações. Sakura é a personagem que elas estão ligadas
        escolhasCap1[0][0] = new EscolhaBoa(sakura, 1, 1, "1. Eu te amo", "Não ligo");
        escolhasCap1[0][1] = new EscolhaRuim(sakura, 1, 1, "2. Cala a boca", "Sucumba!");
        escolhasCap1[0][2] = new EscolhaNeutra(sakura, 1, 1, "3. Oi","Bobão");
        
        escolhasCap1[1][0] = new EscolhaBoa(sakura, 1, 1, "1. Desculpa, não entendi kkkkk", "Foi mal");
        escolhasCap1[1][1] = new EscolhaRuim(sakura, 1, 1, "2. Fala direito", "Sucumba!");
        escolhasCap1[1][2] = new EscolhaNeutra(sakura, 1, 1, "3. ?","Bobão");

        //Chamando as funcoes:
        Player(capitulo1, escolhasCap1);
        TemConquista(personagems, conquistas);
        ExibeConquistas(conquistas);

        //Como cada chamada da funcao Player seria um capitulo, sera necessario avancar um capitulo:
        AvancaCapitulo(personagems);

        //Aqui, a gente chama Player novamente, agora como capitulo 2:
    }

    /*Funcao que vai verificar se o jogador desbloqueou alguma conquista:
    * Vai receber personagens e um ArrayList, aonde sera guardada as conquistas
    */
    public static void TemConquista(List<Personagem> personagems, List<String> conquistas){
        //Criando um iterador para percorrer as personagens:
        Iterator<Personagem> it = personagems.iterator();
        
        while(it.hasNext()){
            //Verifica se pode desbloquear alguma conquista:
            Personagem personagem = it.next();
            personagem.VerifcaConquistas(conquistas);
        }
    }

    //Exibindo as conquistas:
    public static void ExibeConquistas(List<String> conquistas){
        //Criando um iterador para percorrer as personagens:
        Iterator<String> it = conquistas.iterator();
        
        System.out.println("--------------------------------------CONQUISTAS--------------------------------------");
        while(it.hasNext()){
            //Avanca um capitulo para todas as personagens:
            String conquista = it.next();
            System.out.println(conquista);
        }

        //Caso nenhuma conquista esteja desbloqueda:
        if (conquistas.isEmpty()) {
                System.out.println("Nenhuma conquista desbloqueada.");
            }
    }

    //Funcao para avancar um capitulo para as personagens (Atributo capitulo nas classes das personagens):
    public static void AvancaCapitulo(List<Personagem> personagems){
        //Criando um iterador para percorrer as personagens:
        Iterator<Personagem> it = personagems.iterator();
        
        while(it.hasNext()){
            //Avanca um capitulo para todas as personagens:
            Personagem personagem = it.next();
            personagem.setCapitulo();;
        }
    }

    //Funcao player que vai rodar os capitulos
    public static void Player(String capitulo[], Escolhas[][] escolhasCap){
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < capitulo.length; i++){

            //Imprime dialogo
            System.out.println(capitulo[i]);

            //Imprime respostas do jogador
            escolhasCap[i][0].imprimir();
            escolhasCap[i][1].imprimir();
            escolhasCap[i][2].imprimir();

            //Pegando a escolha do jogador
            System.out.print("\nSua escolha: ");
            int resposta = scanner.nextInt();

            //Imprime a reação da personagem
            escolhasCap[i][resposta-1].pontuar();
            System.out.print("Fulana: ");
            escolhasCap[i][resposta-1].responder();
        }

        //Fechando o Scanner:
        scanner.close();
    }
}