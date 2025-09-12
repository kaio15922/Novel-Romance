package GameController;
import java.util.*;

//Sakura eh uma personagem do jogo (Um exemplo)
public class Sakura extends Personagem{
    //Capitulo sera passado de acordo em que capitulo a personagem aparece (No nosso exemplo, Sakura aparece no primeiro.)
    public Sakura(){
        super("Sakura", 19, 0, 1);
    }

    /*Tentativa de implementar sistema de conquistas
    *Basicamente vai ser conquistas específicas para cada personagem do jogo
    entao pensei em implementar na classe correspondente a parsonagem
    */

    @Override
    public void VerifcaConquistas(List<String> conquistas){
        
        //Cada if vai ser uma conquista:
        if (getCapitulo() == 1 && getPontuacao() <= -20) {
            //Adiciona no ArrayList que foi passado como parametro:
            conquistas.add("Espanta mulher! -> Seja capaz de desagradar a Sakura ainda no primeiro capitulo.");
        }else if (getCapitulo() == 1 && getPontuacao() >= 20) {
            conquistas.add("Especialista? -> Ganhe 20 pontos com a Sakura ainda no primeiro capitulo.");
        }
    }


}
