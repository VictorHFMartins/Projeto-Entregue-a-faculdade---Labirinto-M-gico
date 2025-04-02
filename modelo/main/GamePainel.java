package a3.modelo.main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import a3.modelo.cenario.Gerador;
import a3.modelo.objetos.SuperOb;
import a3.modelo.player.Player;
import javax.swing.JOptionPane;

public class GamePainel extends JPanel implements Runnable {

    public final int tamanhoTile = 48; 
    public final int colunas = 17;
    public final int larguraTela = colunas * tamanhoTile;
    public final int linhas = 10;
    public final int alturaTela = linhas * tamanhoTile;
    public int mapaAtual = 0;
    public final int mapaMax = 10;

    int fps = 60;

    public Gerador gm = new Gerador(this);
    public Teclado tc = new Teclado();
    Thread jogoThread;
    public Colisao colisao = new Colisao(this);
    public mapObj aS = new mapObj(this);
    public Player p1 = new Player(this, tc);
    public SuperOb sObj[][] = new SuperOb[mapaMax][10];
    public Fim f = new Fim();

    // Configuração inicial do painel do jogo
    public GamePainel() throws InterruptedException {
        this.setPreferredSize(new Dimension(larguraTela, alturaTela));
        setFocusable(true);
        setDoubleBuffered(true);
        setBackground(Color.BLACK);

        this.addKeyListener(tc);
        
        JOptionPane.showMessageDialog(this, "He he he... bem-vindo ao meu Domínio!", "Mágico" , JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(this, "Para escapar, recupere a chave em cada nível e torça para que esta chave o leve para o proximo andar.", "Mágico", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(this, "você se pergunta por que sorte?", "Magico" , JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(this, "Estas portas tem uma propriedade magica, imbuída com minha própria magia.", "Magico" , JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(this, "caso você escolha errado, se perderá no meu LABIRINTO MÁGICO!!!", "Magico" , JOptionPane.PLAIN_MESSAGE);
        Thread.sleep(1000);
        JOptionPane.showMessageDialog(this, "Boa sorte jogador! que este desafio seja superado com êxito!", "Sistema" , JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(this, "Para se locomover, pressione as teclas W,A,S,D.", "Sistema" , JOptionPane.INFORMATION_MESSAGE);
    }

    public void setupGame() {
        aS.setObj();
    }
    public void initGameThread() {
        jogoThread = new Thread(this);
        jogoThread.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        Graphics2D g2 = (Graphics2D) g;
        gm.draw(g);
        for (int i = 0; i < sObj.length; i++) {
            if(sObj[mapaAtual][i] != null){
                sObj[mapaAtual][i].draw(g2, this);
            }
        }         
        p1.draw(g2);

        if(p1.fim == true){
            g2.drawImage(f.img, 0, 0,larguraTela,alturaTela, this);
        }        
    }

    public void atualizar() {
        p1.atualizar();
    }

    @Override
    public void run() {
        double intervalo = 1000000000 / fps;
        double delta = 0;
        long ultimoTempo = System.nanoTime();
        long tempoAtual;
        long temp = 0;
        int frequencia = 0;

        while (jogoThread != null) {
            tempoAtual = System.nanoTime();
            delta += (tempoAtual - ultimoTempo) / intervalo;
            temp += (tempoAtual - ultimoTempo);
            ultimoTempo = tempoAtual;

            if (delta >= 1) {
                atualizar();
                repaint();
                delta--;
                frequencia++;
            }

            if (temp >= 1000000000) {
                System.out.println("FPS: " + frequencia);
                frequencia = 0;
                temp = 0;
            }
        }
    }
}
