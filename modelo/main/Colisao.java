package a3.modelo.main;

import a3.modelo.mapas.mapas;
import a3.modelo.player.Personagem;

public class Colisao {

    GamePainel gp;
    mapas mp = new mapas();
    

    public Colisao(GamePainel p) {
        this.gp = p;
    }

    public void check(Personagem p1) {

        int esq = p1.x + p1.ret.x;
        int dir = p1.x + p1.ret.x + p1.ret.width;
        int cima = p1.y + p1.ret.y;
        int baixo = p1.y + p1.ret.y + p1.ret.height;

        int colEsq = esq / gp.tamanhoTile;
        int colDir = dir / gp.tamanhoTile;
        int colCima = cima / gp.tamanhoTile;
        int colBaixo = baixo / gp.tamanhoTile;

        int tile1, tile2;

        switch (p1.direcao) {
            case "cima":
                colCima = (cima - p1.velocidade) / gp.tamanhoTile;
                tile1 = gp.gm.mapTileNum[gp.mapaAtual][colEsq][colCima];
                tile2 = gp.gm.mapTileNum[gp.mapaAtual][colDir][colCima];
                if (gp.gm.tile[tile1].colisao == true || gp.gm.tile[tile2].colisao == true) {
                    p1.colisao = true;
                }
                break;
            case "baixo":
                colBaixo = (baixo + p1.velocidade) / gp.tamanhoTile;
                tile1 = gp.gm.mapTileNum[gp.mapaAtual][colEsq][colBaixo];
                tile2 = gp.gm.mapTileNum[gp.mapaAtual][colDir][colBaixo];
                if (gp.gm.tile[tile1].colisao == true || gp.gm.tile[tile2].colisao == true) {
                    p1.colisao = true;
                }
                break;
            case "esquerda":
                colEsq = (esq - p1.velocidade) / gp.tamanhoTile;
                tile1 = gp.gm.mapTileNum[gp.mapaAtual][colEsq][colCima];
                tile2 = gp.gm.mapTileNum[gp.mapaAtual][colEsq][colBaixo];
                if (gp.gm.tile[tile1].colisao == true || gp.gm.tile[tile2].colisao == true) {
                    p1.colisao = true;
                }
                break;
            case "direita":
                colDir = (dir + p1.velocidade) / gp.tamanhoTile;
                tile1 = gp.gm.mapTileNum[gp.mapaAtual][colDir][colCima];
                tile2 = gp.gm.mapTileNum[gp.mapaAtual][colDir][colBaixo];
                if (gp.gm.tile[tile1].colisao == true || gp.gm.tile[tile2].colisao == true) {
                    p1.colisao = true;
                }
                break;
        }
    }
    
    public int objCheck(Personagem p, boolean player){
    
        int index = 999;
        
        for (int i = 0; i < gp.sObj.length; i++) {
            
            if(gp.sObj[gp.mapaAtual][i] != null){
                
                p.ret.x = p.x + p.ret.x;
                p.ret.y = p.y + p.ret.y;
                
                gp.sObj[gp.mapaAtual][i].ret.x = gp.sObj[gp.mapaAtual][i].worldX + gp.sObj[gp.mapaAtual][i].ret.x;
                gp.sObj[gp.mapaAtual][i].ret.y = gp.sObj[gp.mapaAtual][i].worldY + gp.sObj[gp.mapaAtual][i].ret.y;
                
                
                switch(p.direcao){
                    case "cima" : 
                        p.ret.y -= p.velocidade;
                        if(p.ret.intersects(gp.sObj[gp.mapaAtual][i].ret)){
                            if(gp.sObj[gp.mapaAtual][i].colisao == true){
                                gp.p1.colisao = true;
                                if(player == true){
                                    index = i;
                                }
                            }
                        }
                    case "baixo" : 
                        p.ret.y += p.velocidade;
                        if(p.ret.intersects(gp.sObj[gp.mapaAtual][i].ret)){
                            if(gp.sObj[gp.mapaAtual][i].colisao == true){
                                gp.p1.colisao = true;
                                if(player == true){
                                    index = i;
                                }
                            }
                        }
                    case "esquerda" : 
                        p.ret.x -= p.velocidade;
                        if(p.ret.intersects(gp.sObj[gp.mapaAtual][i].ret)){
                            if(gp.sObj[gp.mapaAtual][i].colisao == true){
                                gp.p1.colisao = true;
                                if(player == true){
                                    index = i;
                                }
                            }
                        }
                    case "direita" : 
                        p.ret.x += p.velocidade;
                        if(p.ret.intersects(gp.sObj[gp.mapaAtual][i].ret)){
                            if(gp.sObj[gp.mapaAtual][i].colisao == true){
                                gp.p1.colisao = true;
                                if(player == true){
                                    index = i;
                                }
                            }
                        }
                }
                p.ret.x = p.solidAreaDefautX;
                p.ret.y = p.solidAreaDefautY;
                gp.sObj[gp.mapaAtual][i].ret.x = gp.sObj[gp.mapaAtual][i].solidAreaDefautX;
                gp.sObj[gp.mapaAtual][i].ret.y = gp.sObj[gp.mapaAtual][i].solidAreaDefautY;
            }
        }
        
        return index;
    }
}
        
    
