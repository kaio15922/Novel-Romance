package GameController;

public class Cena {
    String fala;
    Escolhas[] opcoes;

    Cena(String fala, Escolhas... opcoes) {
        this.fala = fala;
        this.opcoes = opcoes;
    }
}
