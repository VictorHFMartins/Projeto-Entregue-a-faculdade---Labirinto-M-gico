package a3.modelo.player;

import a3.modelo.main.Fim;
import java.awt.Graphics2D;
import a3.modelo.main.GamePainel;
import a3.modelo.main.Teclado;
import java.awt.Color;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Player extends Personagem {

    GamePainel gp;
    Teclado tc;
    public boolean chave;
    Random rd = new Random();
    public boolean conclusao = false;
    public boolean fim = false;

    public Player(GamePainel p, Teclado tc) {
        this.gp = p;
        this.tc = tc;
        ret = new Rectangle(8, 16, 32, 32);
        solidAreaDefautX = ret.x;
        solidAreaDefautY = ret.y;
        setValoresIniciais();
        getImgPlayer();
        
    }

    @Override
    public void getImgPlayer() {
        cima = new ImageIcon(getClass().getClassLoader().getResource("res/Jogador/PCostas.png"));
        cima1 = new ImageIcon(getClass().getClassLoader().getResource("res/Jogador/PCostas1.png"));
        cima2 = new ImageIcon(getClass().getClassLoader().getResource("res/Jogador/PCostas2.png"));
        esquerda = new ImageIcon(getClass().getClassLoader().getResource("res/Jogador/PEsquerda.png"));
        esquerda1 = new ImageIcon(getClass().getClassLoader().getResource("res/Jogador/PEsquerda1.png"));
        esquerda2 = new ImageIcon(getClass().getClassLoader().getResource("res/Jogador/PEsquerda2.png"));
        baixo = new ImageIcon(getClass().getClassLoader().getResource("res/Jogador/PFrente.png"));
        baixo1 = new ImageIcon(getClass().getClassLoader().getResource("res/Jogador/PFrente1.png"));
        baixo2 = new ImageIcon(getClass().getClassLoader().getResource("res/Jogador/PFrente2.png"));
        direita = new ImageIcon(getClass().getClassLoader().getResource("res/Jogador/PDireita.png"));
        direita1 = new ImageIcon(getClass().getClassLoader().getResource("res/Jogador/PDireita1.png"));
        direita2 = new ImageIcon(getClass().getClassLoader().getResource("res/Jogador/PDireita2.png"));
    }

    @Override
    public void setValoresIniciais() {
        x = gp.colunas / 2 * gp.tamanhoTile;
        y = gp.tamanhoTile * 7;
        velocidade = 4;
        direcao = "baixo";
    }

    //Imagem do personagem
    @Override
    public void atualizar() {
        if (tc.cima || tc.baixo || tc.esquerda || tc.direita) {
            if (tc.cima && ret.y > 0) {
                direcao = "cima";
            }
            if (tc.baixo && ret.y < gp.alturaTela - gp.tamanhoTile) {
                direcao = "baixo";
            }
            if (tc.esquerda && ret.x > 0) {
                direcao = "esquerda";
            }
            if (tc.direita && ret.x < gp.larguraTela - gp.tamanhoTile) {
                direcao = "direita";
            }

            colisao = false;
            gp.colisao.check(this);
            int objIndex = gp.colisao.objCheck(this, true);
            interact(objIndex);

            if (colisao == false) {

                switch (direcao) {
                    case "cima":
                        y -= velocidade;
                        break;
                    case "baixo":
                        y += velocidade;
                        break;
                    case "esquerda":
                        x -= velocidade;
                        break;
                    case "direita":
                        x += velocidade;
                        break;
                }
            }

            spriteCount++;

            if (spriteCount > 12) {
                if (spriteNum == 1) {
                    spriteNum = 2;
                } else if (spriteNum == 2) {
                    spriteNum = 1;
                }
                spriteCount = 0;
            }
        }

//        System.out.println("colX: " + (x / gp.tamanhoTile) + ", RowY: " + (y / gp.tamanhoTile));
    }

    public void interact(int i) {
        if (i != 999) {
            
            String nomeObj = gp.sObj[gp.mapaAtual][i].nome;
            
            if(conclusao == true){
                
                
            }
            
            switch(gp.mapaAtual){
                case 0 :
                switch (nomeObj) {
                    case "Porta":
                        if(chave == true){
                        gp.gm.tp(gp.mapaAtual+1);
                        }
                        chave = false;
                        break;
                    case "Key":
                        gp.sObj[gp.mapaAtual][0] = null;
                        chave = true;
                        System.out.println("Pegou uma chave!");
                        break;
                }
            break;
            case 1 : 
                switch (nomeObj) {
                    case "Porta1":
                        if(chave == true){
                        gp.gm.tp(gp.mapaAtual+1);
                        }
                        chave = false;
                        break;
                    case "Porta2":
                        if(chave == true){
                            int aleatorio = rd.nextInt(gp.mapaMax-1);
                            if (aleatorio != gp.mapaAtual){
                            gp.gm.tp(aleatorio);
                            }
                        }
                        chave = false;
                        break;
                    case "Key":
                        gp.sObj[gp.mapaAtual][0] = null;
                        chave = true;
                        System.out.println("Pegou uma chave!");
                        break;
                }
            case 2 : 
                    switch (nomeObj) {
                    case "Buraco":
                        gp.gm.tp(0);
                            System.out.println("Voce caiu!");
                        break;
                    case "Porta1":
                        if(chave == true){
                            gp.gm.tp(gp.mapaAtual+1);
                        }
                        chave = false;
                        break;
                    case "Porta2":
                        if(chave == true){
                            int aleatorio = rd.nextInt(gp.mapaMax-1);
                            if (aleatorio != gp.mapaAtual){
                            gp.gm.tp(aleatorio);
                            }
                        }
                        chave = false;
                        break;
                    case "Porta3":
                        if(chave == true){
                            int aleatorio = rd.nextInt(gp.mapaMax-1);
                            if (aleatorio != gp.mapaAtual){
                            gp.gm.tp(aleatorio);
                            }
                        }
                        chave = false;
                        break;
                    case "Key":
                        gp.sObj[gp.mapaAtual][0] = null;
                        chave = true;
                        System.out.println("Pegou uma chave!");
                        break;
                    }
                break;
            case 3: 
                    switch (nomeObj) {
                    case "Buraco":
                        gp.gm.tp(0);
                            System.out.println("Voce caiu!");
                        break;
                    case "Porta1":
                        if(chave == true){
                            gp.gm.tp(gp.mapaAtual+1);
                        }
                        chave = false;
                        break;
                    case "Porta2":
                        if(chave == true){
                            int aleatorio = rd.nextInt(gp.mapaMax-1);
                            if (aleatorio != gp.mapaAtual){
                            gp.gm.tp(aleatorio);
                            }
                        }
                        chave = false;
                        break;
                    case "Porta3":
                        if(chave == true){
                            int aleatorio = rd.nextInt(gp.mapaMax-1);
                            if (aleatorio != gp.mapaAtual){
                            gp.gm.tp(aleatorio);
                            }
                        }
                        chave = false;
                        break;
                    case "Key":
                        gp.sObj[gp.mapaAtual][0] = null;
                        chave = true;
                        System.out.println("Pegou uma chave!");
                        break;
                    }
                break;
            case 4 : 
                    switch (nomeObj) {
                    case "Buraco":
                        gp.gm.tp(0);
                            System.out.println("Voce caiu!");
                        break;
                    case "Porta1":
                        if(chave == true){
                            gp.gm.tp(gp.mapaAtual+1);
                        }
                        chave = false;
                        break;
                    case "Porta2":
                        if(chave == true){
                            int aleatorio = rd.nextInt(gp.mapaMax-1);
                            if (aleatorio != gp.mapaAtual){
                            gp.gm.tp(aleatorio);
                            }
                        }
                        chave = false;
                        break;
                    case "Porta3":
                        if(chave == true){
                            int aleatorio = rd.nextInt(gp.mapaMax-1);
                            if (aleatorio != gp.mapaAtual){
                            gp.gm.tp(aleatorio);
                            }
                        }
                        chave = false;
                        break;
                    case "Key":
                        gp.sObj[gp.mapaAtual][0] = null;
                        chave = true;
                        System.out.println("Pegou uma chave!");
                        break;
                    }
                break;
            case 5 : 
                    switch (nomeObj) {
                    case "Buraco":
                        gp.gm.tp(0);
                            System.out.println("Voce caiu!");
                        break;
                    case "Porta1":
                        if(chave == true){
                            gp.gm.tp(gp.mapaAtual+1);
                        }
                        chave = false;
                        break;
                    case "Porta2":
                        if(chave == true){
                            int aleatorio = rd.nextInt(gp.mapaMax-1);
                            if (aleatorio != gp.mapaAtual){
                            gp.gm.tp(aleatorio);
                            }
                        }
                        chave = false;
                        break;
                    case "Porta3":
                        if(chave == true){
                            int aleatorio = rd.nextInt(gp.mapaMax-1);
                            if (aleatorio != gp.mapaAtual){
                            gp.gm.tp(aleatorio);
                            }
                        }
                        chave = false;
                        break;
                    case "Key":
                        gp.sObj[gp.mapaAtual][0] = null;
                        chave = true;
                        System.out.println("Pegou uma chave!");
                        break;
                    }
                break;
            case 6 : 
                    switch (nomeObj) {
                    case "Buraco":
                        gp.gm.tp(0);
                            System.out.println("Voce caiu!");
                        break;
                    case "Porta1":
                        if(chave == true){
                            gp.gm.tp(gp.mapaAtual+1);
                        }
                        chave = false;
                        break;
                    case "Porta2":
                        if(chave == true){
                            int aleatorio = rd.nextInt(gp.mapaMax-1);
                            if (aleatorio != gp.mapaAtual){
                            gp.gm.tp(aleatorio);
                            }
                        }
                        chave = false;
                        break;
                    case "Porta3":
                        if(chave == true){
                            int aleatorio = rd.nextInt(gp.mapaMax-1);
                            if (aleatorio != gp.mapaAtual){
                            gp.gm.tp(aleatorio);
                            }
                        }
                        chave = false;
                        break;
                    case "Key":
                        gp.sObj[gp.mapaAtual][0] = null;
                        chave = true;
                        System.out.println("Pegou uma chave!");
                        break;
                    }
                break;
            case 7 : 
                    switch (nomeObj) {
                    case "Buraco":
                        gp.gm.tp(0);
                            System.out.println("Voce caiu!");
                        break;
                    case "Porta1":
                        if(chave == true){
                            gp.gm.tp(gp.mapaAtual+1);
                        }
                        chave = false;
                        break;
                    case "Porta2":
                        if(chave == true){
                            int aleatorio = rd.nextInt(gp.mapaMax-1);
                            if (aleatorio != gp.mapaAtual){
                            gp.gm.tp(aleatorio);
                            }
                        }
                        chave = false;
                        break;
                    case "Porta3":
                        if(chave == true){
                            int aleatorio = rd.nextInt(gp.mapaMax-1);
                            if (aleatorio != gp.mapaAtual){
                            gp.gm.tp(aleatorio);
                            }
                        }
                        chave = false;
                        break;
                    case "Key":
                        gp.sObj[gp.mapaAtual][0] = null;
                        chave = true;
                        System.out.println("Pegou uma chave!");
                        break;
                    }
                break;
            case 8 : 
                    switch (nomeObj) {
                    case "Buraco":
                        gp.gm.tp(0);
                            System.out.println("Voce caiu!");
                        break;
                    case "Porta1":
                        if(chave == true){
                            gp.gm.tp(gp.mapaAtual+1);
                        }
                        chave = false;
                        break;
                    case "Porta2":
                        if(chave == true){
                            int aleatorio = rd.nextInt(gp.mapaMax-1);
                            if (aleatorio != gp.mapaAtual){
                            gp.gm.tp(aleatorio);
                            }
                        }
                        chave = false;
                        break;
                    case "Porta3":
                        if(chave == true){
                            int aleatorio = rd.nextInt(gp.mapaMax-1);
                            if (aleatorio != gp.mapaAtual){
                            gp.gm.tp(aleatorio);
                            }
                        }
                        chave = false;
                        break;
                    case "Key":
                        gp.sObj[gp.mapaAtual][0] = null;
                        chave = true;
                        System.out.println("Pegou uma chave!");
                        break;
                    }
                break;
            case 9 : 
                    switch (nomeObj) {
                    case "Buraco":
                        gp.gm.tp(0);
                            System.out.println("Voce caiu!");
                        break;
                    case "Porta1":
                        if(chave == true && conclusao == true){
                            System.out.println("Parabens, voce ganhou o jogo!");
                            System.out.println("fim = " + conclusao);
                            gp.f.fimDeJogo();
                            fim = true;
                        }
                        chave = false;
                    case "Porta2":
                        if(chave == true){
                            int aleatorio = rd.nextInt(gp.mapaMax-1);
                            if (aleatorio != gp.mapaAtual){
                            gp.gm.tp(aleatorio);
                            }
                        }
                        chave = false;
                        break;
                    case "Porta3":
                        if(chave == true){
                            int aleatorio = rd.nextInt(gp.mapaMax-1);
                            if (aleatorio != gp.mapaAtual){
                            gp.gm.tp(aleatorio);
                            }
                        }
                        chave = false;
                        break;
                    case "Key":
                        gp.sObj[gp.mapaAtual][0] = null;
                        chave = true;
                        System.out.println("Pegou uma chave!");
                        break;
                    }
                break;
            }
        }
    }

    @Override
    public void draw(Graphics2D g2) {

        Image img = null;

        switch (direcao) {
            case "cima":
                if (spriteNum == 1) {
                    img = cima1.getImage();
                }
                if (spriteNum == 2) {
                    img = cima2.getImage();
                }
                break;
            case "esquerda":
                if (spriteNum == 1) {
                    img = esquerda1.getImage();
                }
                if (spriteNum == 2) {
                    img = esquerda2.getImage();
                }
                break;
            case "baixo":
                if (spriteNum == 1) {
                    img = baixo1.getImage();
                }
                if (spriteNum == 2) {
                    img = baixo2.getImage();
                }
                break;
            case "direita":
                if (spriteNum == 1) {
                    img = direita1.getImage();
                }
                if (spriteNum == 2) {
                    img = direita2.getImage();
                }
                break;
        }
        if (tc.cima == false && tc.baixo == false && tc.esquerda == false && tc.direita == false) {
            switch (direcao) {
                case "cima":
                    img = cima.getImage();
                    break;
                case "baixo":
                    img = baixo.getImage();
                    break;
                case "esquerda":
                    img = esquerda.getImage();
                    break;
                case "direita":
                    img = direita.getImage();
                    break;
            }
        }
        
        if (img != null) {
            g2.drawImage(img, x, y, gp.tamanhoTile, gp.tamanhoTile, null);
        } else {
            g2.setBackground(Color.RED);
        }                
        if(conclusao = true){
//            gp.f.draw(g2);
        }

    }
}
