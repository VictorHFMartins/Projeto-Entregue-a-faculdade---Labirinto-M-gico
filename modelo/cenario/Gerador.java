package a3.modelo.cenario;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import a3.modelo.main.GamePainel;
import a3.modelo.mapas.mapas;
import java.awt.Rectangle;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Gerador {

    GamePainel gp;
    mapas mp = new mapas();
    public Tile[] tile;
    public int mapTileNum[][][];
    public boolean teleport;

    public Gerador(GamePainel p) {

        this.gp = p;
        tile = new Tile[6];
        mapTileNum = new int[gp.mapaMax][p.colunas][p.linhas];
        getTile();
        carregarMapa(mp.getMapas(gp.mapaAtual), gp.mapaAtual);
    }

    public void getTile() {

        tile[0] = new Tile();
        tile[0].img = new ImageIcon(getClass().getClassLoader().getResource("tiles//agua.png"));
        tile[0].colisao = true;
        tile[1] = new Tile();
        tile[1].img = new ImageIcon(getClass().getClassLoader().getResource("tiles//Chão1.jpg"));
        tile[2] = new Tile();
        tile[2].img = new ImageIcon(getClass().getClassLoader().getResource("tiles//Parede1.jpg"));
        tile[2].colisao = true;
        tile[3] = new Tile();
        tile[3].img = new ImageIcon(getClass().getClassLoader().getResource("tiles//EscadaBaixoPedraEs.png"));
        tile[4] = new Tile();
        tile[4].img = new ImageIcon(getClass().getClassLoader().getResource("tiles//EscadaBaixoPedraDr.png"));
        tile[4].r1 = new Rectangle();
        tile[5] = new Tile();
        tile[5].img = new ImageIcon(getClass().getClassLoader().getResource("tiles//BuracoPedra.png"));
    }

    public void carregarMapa(String mp, int mapa) {

        try {
            InputStream is = getClass().getResourceAsStream(mp);
            if (is == null) {
                throw new FileNotFoundException("Arquivo de mapa não encontrado: " + mp);
            }
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            int tileX = 0;
            int tileY = 0;

            while (tileX < gp.colunas && tileY < gp.linhas) {

                String linhas = br.readLine();
                while (tileX < gp.colunas) {
                    String num[] = linhas.split(" ");
                    int n = Integer.parseInt(num[tileX]);
                    mapTileNum[mapa][tileX][tileY] = n;
                    tileX++;
                }

                if (tileX == gp.colunas) {
                    tileX = 0;
                    tileY++;
                }
            }
            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void tp(int map) {
        gp.mapaAtual = map;

        if (gp.mapaAtual > gp.mapaMax) {
            gp.mapaAtual = 1; 
        }

        String caminhoMapa = mp.getMapas(gp.mapaAtual);
        System.out.println("Carregando mapa: " + caminhoMapa);

        carregarMapa(caminhoMapa, gp.mapaAtual);
        
        if (mapTileNum[gp.mapaAtual] != null) {
            System.out.println("Mapa carregado com sucesso. Mapa atual: " + gp.mapaAtual);
        } else {
            System.out.println("Erro ao carregar o mapa.");
        }

        gp.aS.setObj();
        System.out.println("Objetos do mapa configurados.");

        gp.p1.setValoresIniciais();
        gp.p1.direcao= "cima";
        System.out.println("Valores iniciais do jogador redefinidos.");

        gp.repaint();  
        System.out.println("Tela redesenhada.");
    }

    public void draw(Graphics g2) {

        int coluna = 0;
        int linha = 0;
        int x = 0;
        int y = 0;

        while (coluna < gp.colunas && linha < gp.linhas) {
            
            int tileNum = mapTileNum[gp.mapaAtual][coluna][linha];
            g2.drawImage(tile[tileNum].img.getImage(), x, y, gp.tamanhoTile, gp.tamanhoTile, null);
            
            coluna++;
            x += gp.tamanhoTile;

            if (coluna == gp.colunas) {
                coluna = 0;
                x = 0;
                linha++;
                y += gp.tamanhoTile;
            }
        }
    }
}
