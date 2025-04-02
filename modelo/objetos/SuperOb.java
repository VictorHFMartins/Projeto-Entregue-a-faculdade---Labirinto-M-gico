
package a3.modelo.objetos;

import a3.modelo.main.GamePainel;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

public class SuperOb {
    
    public ImageIcon img;
    public String nome;
    public boolean colisao;
    public int worldX, worldY;
    public Rectangle ret = new Rectangle(0,0,48,48);
    public int solidAreaDefautX = 0;
    public int solidAreaDefautY = 0;
    
    public void draw(Graphics2D g2, GamePainel gp){
        g2.drawImage(img.getImage(), worldX, worldY, gp.tamanhoTile, gp.tamanhoTile, null);
    }
}
