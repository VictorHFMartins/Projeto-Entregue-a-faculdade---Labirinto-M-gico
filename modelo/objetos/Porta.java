
package a3.modelo.objetos;

import javax.swing.ImageIcon;

public class Porta extends SuperOb {

    public Porta(String nome) {
        this.nome = nome;
        img = new ImageIcon(getClass().getClassLoader().getResource("obj//door.png"));
        colisao = true;     
    }
}
