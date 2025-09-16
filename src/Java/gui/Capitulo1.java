package gui;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

public class Capitulo1
{
    // Dialogos
    private ArrayList<String> dialogosCap1 = new ArrayList<>(List.of("Salve","como vai", "Safe"));
    private int indiceDialogo = 0;

    public JPanel painelCap1(Telas controle)
    {
        JPanel cap1 = new JPanel(null);
        
        // Plano de fundo
        ImageIcon planoDeFundo = new ImageIcon(getClass().getResource("/Resources/Background/Cap1-1.1.jpg"));
        JLabel imagem = new JLabel(planoDeFundo);
        imagem.setBounds(0, 0, planoDeFundo.getIconWidth(), planoDeFundo.getIconHeight());

        // Caixa de dialogo
        ImageIcon caixa = new ImageIcon(getClass().getResource("/Resources/DialogueBox/CaixaDeDialogo.png"));
        JLabel imagem1 = new JLabel(caixa);
        imagem1.setBounds(150, 450, caixa.getIconWidth(), caixa.getIconHeight());

        // Texto da caixa
        JTextArea caixaDeDialogo = new JTextArea(dialogosCap1.get(indiceDialogo));
        caixaDeDialogo.setBounds(200, 520, 500, 100);
        caixaDeDialogo.setEditable(false);
        caixaDeDialogo.setLineWrap(true);
        caixaDeDialogo.setWrapStyleWord(true);
        caixaDeDialogo.setOpaque(false);
        caixaDeDialogo.setFont(new Font("Serif", Font.PLAIN, 25));

        // Next
        JButton Next = new JButton();
        Next.setBounds(810, 620, 35, 25);
        Next.setContentAreaFilled(false);
        Next.setOpaque(false);
        Next.addActionListener(e ->{
            indiceDialogo++;
            if(indiceDialogo < dialogosCap1.size())
            {
                caixaDeDialogo.setText(dialogosCap1.get(indiceDialogo));
            }
            else
            {
                caixaDeDialogo.setText("Os diálogos desse capítulo encerreram");
                Next.setEnabled(false);
            }
        });

        // Nome do prota
        JLabel nome = new JLabel("Murilo");
        nome.setFont(new Font("Serif", Font.PLAIN, 24));
        nome.setBounds(205, 455, 100,30);

        // Add camadas
        JLayeredPane layered = new JLayeredPane();
        layered.setBounds(0, 0, 1000, 700);

        layered.add(imagem, JLayeredPane.DEFAULT_LAYER);
        layered.add(imagem1, JLayeredPane.PALETTE_LAYER);
        layered.add(caixaDeDialogo, JLayeredPane.MODAL_LAYER);
        layered.add(Next, JLayeredPane.DRAG_LAYER);
        layered.add(nome, JLayeredPane.POPUP_LAYER);

        cap1.add(layered);

        return cap1;
    }
}
