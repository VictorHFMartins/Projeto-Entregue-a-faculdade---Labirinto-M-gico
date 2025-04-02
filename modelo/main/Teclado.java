package a3.modelo.main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Teclado implements KeyListener{
    public boolean cima, baixo, esquerda, direita;
    
    @Override
    public void keyTyped(KeyEvent e) {       
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int tecla = e.getKeyCode();
        if(tecla == KeyEvent.VK_W){cima = true;}
        if(tecla == KeyEvent.VK_A){esquerda = true;}
        if(tecla == KeyEvent.VK_S){baixo = true;}
        if(tecla == KeyEvent.VK_D){direita = true;}
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int tecla = e.getKeyCode();
        if(tecla == KeyEvent.VK_W){cima = false;}
        if(tecla == KeyEvent.VK_A){esquerda = false;}
        if(tecla == KeyEvent.VK_S){baixo = false;}
        if(tecla == KeyEvent.VK_D){direita = false;}
    }
    
}
