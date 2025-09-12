package gui;

import java.io.IOException;
import java.net.URL;
import javax.sound.sampled.*;
import javax.swing.*;

public class TelaInicial
{
    JFrame janela = new JFrame();
    JLabel texto = new JLabel();
    JLayeredPane camadas = new JLayeredPane();

    public void Janela()
    {
        janela.setLayout(null);        
        janela.setTitle("Doce Amor");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setResizable(false);
        janela.setSize(1024, 1024);

        camadas.setBounds(0,0,1024,1024);

        ImageIcon planoDeFundo = new ImageIcon(getClass().getResource("/Resources/Background/Inicio.png"));
        JLabel imagem = new JLabel(planoDeFundo);
        imagem.setBounds(0, 0, planoDeFundo.getIconWidth(), planoDeFundo.getIconHeight());

        JButton iniciar = new JButton("");
        iniciar.setSize(260,50);
        iniciar.setLocation(390, 505);
        iniciar.setContentAreaFilled(false);
        iniciar.setOpaque(false);

        JButton continuar = new JButton("");
        continuar.setSize(230,50);
        continuar.setLocation(270, 582);
        continuar.setContentAreaFilled(false);
        continuar.setOpaque(false);

        JButton conquistas = new JButton("");
        conquistas.setSize(245,50);
        conquistas.setLocation(510, 582);
        conquistas.setContentAreaFilled(false);
        conquistas.setOpaque(false);

        camadas.add(imagem, JLayeredPane.DEFAULT_LAYER);
        camadas.add(iniciar, JLayeredPane.PALETTE_LAYER);
        camadas.add(continuar, JLayeredPane.PALETTE_LAYER);
        camadas.add(conquistas, JLayeredPane.PALETTE_LAYER);

        janela.add(camadas);

        try {
            URL url = TelaInicial.class.getResource("/Resources/Music/DokiDoki.wav");
            AudioInputStream audio = AudioSystem.getAudioInputStream(url);
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }

        janela.setVisible(true);
    }
}
