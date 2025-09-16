package gui;

import java.net.URL;
import javax.sound.sampled.*;
import javax.swing.*;

public class TelaInicial
{
    Clip clip;

    public JPanel Inicio(Telas controle)
    {
        JPanel telaInicial = new JPanel(null);

        // Plano de fundo
        ImageIcon planoDeFundo = new ImageIcon(getClass().getResource("/Resources/Background/Inicio.png"));
        JLabel imagem = new JLabel(planoDeFundo);
        imagem.setBounds(0, 0, planoDeFundo.getIconWidth(), planoDeFundo.getIconHeight());

        // Iniciar
        JButton iniciar = new JButton("");
        iniciar.setSize(190,50);
        iniciar.setLocation(415, 190);
        iniciar.setContentAreaFilled(false);
        iniciar.setOpaque(false);

        // Avança para o capítulo 1
        iniciar.addActionListener(e -> {
            clip.stop();
            controle.mostraCard("cap1");
        });
        
        // Continuar
        JButton continuar = new JButton("");
        continuar.setSize(190,50);
        continuar.setLocation(295, 260);
        continuar.setContentAreaFilled(false);
        continuar.setOpaque(false);
        
        // Conquistas
        JButton conquistas = new JButton("");
        conquistas.setSize(190,50);
        conquistas.setLocation(535, 260);
        conquistas.setContentAreaFilled(false);
        conquistas.setOpaque(false);

        // Add camadas
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0 , 1000, 700);

        layeredPane.add(imagem, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(iniciar, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(continuar, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(conquistas, JLayeredPane.PALETTE_LAYER);

        // Pondo musica e trantando ela
        try {
            URL url = TelaInicial.class.getResource("/Resources/Music/DokiDoki.wav");
            AudioInputStream audio = AudioSystem.getAudioInputStream(url);
            clip = AudioSystem.getClip();
            clip.open(audio);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            clip.start();
        } 
        catch(Exception e) 
        {
            e.getMessage();
        }

        telaInicial.add(layeredPane);

        return telaInicial;
    }
}
