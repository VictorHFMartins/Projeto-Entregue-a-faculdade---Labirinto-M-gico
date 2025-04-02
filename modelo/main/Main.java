package a3.modelo.main;

import javax.swing.JFrame;

public class Main extends JFrame {

    public Main() throws InterruptedException {

        setTitle("LABIRINTO MÁGICO");
        setVisible(true);
        requestFocus();
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GamePainel p = new GamePainel();
        add(p);
        p.initGameThread();
        p.setupGame();
        pack();
        setLocationRelativeTo(null);
        p.requestFocusInWindow();
    }

    public static void main(String[] args) throws InterruptedException {
        Main j = new Main();
    }

}
