package a3.modelo.main;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Fim {
    
    GamePainel gp;
    Image img;
    public Fim() {
    }
    
    
    public void fimDeJogo(){
        ImageIcon fim = new ImageIcon(getClass().getClassLoader().getResource("res//Conclusão.png"));
        img = fim.getImage();
    }

    public void draw(Graphics2D g2){
                g2.drawImage(img, 0, 0, gp.larguraTela, gp.alturaTela, gp);
    }
}