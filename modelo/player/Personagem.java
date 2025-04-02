package a3.modelo.player;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

public abstract class Personagem {

    public ImageIcon cima, baixo, esquerda, direita;
    public ImageIcon cima1, baixo1, esquerda1, direita1;
    public ImageIcon cima2, baixo2, esquerda2, direita2;
    public Rectangle ret;
    public int solidAreaDefautX,solidAreaDefautY;
    public boolean colisao = false;

    Image img;
    public int x, y;
    public int velocidade;
    public String direcao;
    public int spriteNum = 1;
    public int spriteCount = 0;

    public abstract void getImgPlayer();

    public abstract void setValoresIniciais();

    public abstract void atualizar();

    public abstract void draw(Graphics2D g2);

}
