package gui;

import java.net.URL;
import javax.sound.sampled.*;
import javax.swing.*;

public class TelaInicial implements Tela
{
    // Criação de objetos janela, texto, camadas // Variavel clip para musica
    JFrame janela = new JFrame();
    JLayeredPane camadas = new JLayeredPane();
    private Clip clip;

    // Criação de objeto cap1 para acessar capitulo 1
    Tela cap1 = new TelaCapitulo1();

    public void exibirJanela()
    {
        // Configs janela
        janela.setLayout(null);        
        janela.setTitle("Doce Amor");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setResizable(false);
        janela.setSize(1024, 700);

        // Setando limites das camadas
        camadas.setBounds(0,0,1024,700);

        // Plano de fundo
        ImageIcon planoDeFundo = new ImageIcon(getClass().getResource("/Resources/Background/Inicio.png"));
        JLabel imagem = new JLabel(planoDeFundo);
        imagem.setBounds(0, 0, planoDeFundo.getIconWidth(), planoDeFundo.getIconHeight());

        // Configs botão inciar
        JButton iniciar = new JButton("");
        iniciar.setSize(190,50);
        iniciar.setLocation(415, 190);
        iniciar.setContentAreaFilled(false);
        iniciar.setOpaque(false);
        iniciar.addActionListener(e -> {
            janela.setVisible(false);
            if(clip != null && clip.isRunning())
            {
                clip.close();
            }
            cap1.exibirJanela();
        });

        // Configs botão continuar
        JButton continuar = new JButton("");
        continuar.setSize(190,50);
        continuar.setLocation(295, 260);
        continuar.setContentAreaFilled(false);
        continuar.setOpaque(false);
        continuar.addActionListener(e -> {
            System.out.println("Continuar Clicado");
        });

        // Configs botão conquistas
        JButton conquistas = new JButton("");
        conquistas.setSize(190,50);
        conquistas.setLocation(535, 260);
        conquistas.setContentAreaFilled(false);
        conquistas.setOpaque(false);
        conquistas.addActionListener(e -> {
            System.out.println("Conquistas Clicado");
        });

        // Organizando itens nas camadas
        camadas.add(imagem, JLayeredPane.DEFAULT_LAYER);
        camadas.add(iniciar, JLayeredPane.PALETTE_LAYER);
        camadas.add(continuar, JLayeredPane.PALETTE_LAYER);
        camadas.add(conquistas, JLayeredPane.PALETTE_LAYER);

        janela.add(camadas);

        // Colocando música e tratando ela caso dê algum bug
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

        // Fazendo tela aparecer
        janela.setVisible(true);
    }
}
