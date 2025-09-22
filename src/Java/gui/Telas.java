package gui;

import javax.swing.*;
import java.awt.*;
import GameController.*;

public class Telas 
{
    // Componentes da interface
    private JFrame frame;
    private JPanel painelPrincipal;
    private CardLayout cardLayout;
    private Sakura npc1;

    // Método que vai na Main
    public void Janela()
    {
        // Criação do objeto unico pra acumular valor, usar metodos, etc. Ta servindo pra garantir que alterações em valores persistam em outros Caps.
        npc1 = new Sakura();

        // Configurando janela
        frame = new JFrame();
        frame.setTitle("Doce Amor");
        frame.setSize(1000,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Configurando o sistema mais útil de Swing kk vulgo CardLayout
        cardLayout = new CardLayout();
        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(cardLayout);

        // Os cards que vão no PainelPrincipal
        TelaInicial inicial = new TelaInicial();
        Capitulo1 cap1 = new Capitulo1();

        // ADD nos cards
        // O this como parametro esta recebendo a propria classe, ou melhor dizendo, um objeto dessa classe Telas
        painelPrincipal.add(inicial.Inicio(this), "telaInicial");
        painelPrincipal.add(cap1.painelCap1(this, npc1), "cap1");

        // Coloca o painel no JFrame e set o Frame visivel, o CardLayout trabalha com ordem de precedencia, entao o primeiro a ser mostrado é telaInicial
        frame.setContentPane(painelPrincipal);
        frame.setVisible(true);
    }

        // Método que serve para usar dentro dos Caps pra chamar outros Caps
    public void mostraCard(String nomeDoCard)
    {
        cardLayout.show(painelPrincipal, nomeDoCard);
    }
}
