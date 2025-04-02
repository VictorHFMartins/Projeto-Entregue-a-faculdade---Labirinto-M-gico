
package a3.modelo.objetos;

import javax.swing.ImageIcon;

public class Buraco extends SuperOb{

    public Buraco() {

        nome = "Buraco";
        img = new ImageIcon(getClass().getClassLoader().getResource("tiles//BuracoPedra.png"));
        colisao = true;
    }
    
}
