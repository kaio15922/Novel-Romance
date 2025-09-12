package gui;

import javax.swing.*;
import java.awt.*;

public class TelaCapitulo1 implements Tela
{
    public void exibirJanela()
    {
        // Criação de obejtos janela, camadas
        JFrame janela1 = new JFrame();
        JLayeredPane camadas1 = new JLayeredPane();

        // Configs janela
        janela1.setLayout(null);        
        janela1.setTitle("Capítulo 1");
        janela1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela1.setResizable(false);
        janela1.setSize(1024, 700);

        // Setando limites das camadas
        camadas1.setBounds(0,0,1024,700);

        // Plano de fundo
        ImageIcon planoDeFundo1 = new ImageIcon(getClass().getResource("/Resources/Background/Cap1-1.1.jpg"));
        JLabel imagem = new JLabel(planoDeFundo1);
        imagem.setBounds(0, 0, planoDeFundo1.getIconWidth(), planoDeFundo1.getIconHeight());

        // Caixa de dialogo
        ImageIcon caixa = new ImageIcon(getClass().getResource("/Resources/DialogueBox/CaixaDeDialogo.png"));
        JLabel imagem1 = new JLabel(caixa);
        imagem1.setBounds(150, 450, caixa.getIconWidth(), caixa.getIconHeight());

        // Botao next
        JButton next = new JButton("");
        next.setBounds(810, 620, 35, 25);
        next.setContentAreaFilled(false);
        next.setOpaque(false);
        next.addActionListener(e -> {
            System.out.println("Botao Clicado");
        });

        // Prota nome
        JLabel nome = new JLabel("Murilo");
        nome.setFont(new Font("Serif", Font.PLAIN, 24));
        nome.setBounds(205, 455, 100,30);
        

        camadas1.add(imagem, JLayeredPane.DEFAULT_LAYER);
        camadas1.add(imagem1, JLayeredPane.PALETTE_LAYER);
        camadas1.add(next, JLayeredPane.MODAL_LAYER);
        camadas1.add(nome, JLayeredPane.POPUP_LAYER);

        janela1.add(camadas1);

        janela1.setVisible(true);

    }
}
