
package a3.modelo.objetos;

import javax.swing.ImageIcon;

public class Key extends SuperOb {

    public Key() {
        nome = "Key";
        img = new ImageIcon(getClass().getClassLoader().getResource("obj//keyTile.png"));
        colisao = true;
    }
    
}
