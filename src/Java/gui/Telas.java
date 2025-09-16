package gui;

import javax.swing.*;
import java.awt.*;

public class Telas 
{
    private JFrame frame;
    private JPanel painelPrincipal;
    private CardLayout cardLayout;

    public void Janela()
    {
        frame = new JFrame();
        frame.setTitle("Doce Amor");
        frame.setSize(1000,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cardLayout = new CardLayout();
        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(cardLayout);

        TelaInicial inicial = new TelaInicial();
        Capitulo1 cap1 = new Capitulo1();

        painelPrincipal.add(inicial.Inicio(this), "telaInicial");
        painelPrincipal.add(cap1.painelCap1(this), "cap1");

        frame.setContentPane(painelPrincipal);
        frame.setVisible(true);
    }

    public void mostraCard(String nomeDoCard)
    {
        cardLayout.show(painelPrincipal, nomeDoCard);
    }
}
