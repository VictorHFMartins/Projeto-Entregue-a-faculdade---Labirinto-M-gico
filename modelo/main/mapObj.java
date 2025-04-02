
package a3.modelo.main;

import a3.modelo.objetos.Buraco;
import a3.modelo.objetos.Key;
import a3.modelo.objetos.Porta;
import java.util.Random;

public class mapObj {
    GamePainel gp;
    Random rd = new Random();
    

    public mapObj(GamePainel gp) {
    this.gp = gp;
    }
    
    public void setObj(){
        
     if(gp.mapaAtual == 0){
        gp.sObj[gp.mapaAtual][0] = new Key();
        gp.sObj[gp.mapaAtual][0].worldX = gp.colunas/2*gp.tamanhoTile;
        gp.sObj[gp.mapaAtual][0].worldY = gp.linhas/2*gp.tamanhoTile;

        gp.sObj[gp.mapaAtual][1] = new Porta("Porta");
        gp.sObj[gp.mapaAtual][1].worldX = gp.colunas/2*gp.tamanhoTile;
        gp.sObj[gp.mapaAtual][1].worldY = gp.tamanhoTile*0;


    }
    else if(gp.mapaAtual == 1){
        
        gp.sObj[gp.mapaAtual][0] = new Key();
        gp.sObj[gp.mapaAtual][0].worldX = gp.tamanhoTile*3;
        gp.sObj[gp.mapaAtual][0].worldY = gp.tamanhoTile*7;
        
        gp.sObj[gp.mapaAtual][1] = new Porta("Porta1");
        gp.sObj[gp.mapaAtual][1].worldX = gp.tamanhoTile*3;
        gp.sObj[gp.mapaAtual][1].worldY = gp.tamanhoTile*0;
        
        gp.sObj[gp.mapaAtual][2] = new Porta("Porta2");
        gp.sObj[gp.mapaAtual][2].worldX = gp.tamanhoTile*13;
        gp.sObj[gp.mapaAtual][2].worldY = gp.tamanhoTile*0;

        gp.sObj[gp.mapaAtual][3] = new Buraco();
        gp.sObj[gp.mapaAtual][3].worldX = gp.tamanhoTile*7;
        gp.sObj[gp.mapaAtual][3].worldY = gp.tamanhoTile*7;
        
        gp.sObj[gp.mapaAtual][4] = new Buraco();
        gp.sObj[gp.mapaAtual][4].worldX = gp.tamanhoTile*8;
        gp.sObj[gp.mapaAtual][4].worldY = gp.tamanhoTile*5;
        
    }
        
    else if(gp.mapaAtual == 2){
        gp.sObj[gp.mapaAtual][0] = new Key();
        gp.sObj[gp.mapaAtual][0].worldX = gp.tamanhoTile*5;
        gp.sObj[gp.mapaAtual][0].worldY = gp.tamanhoTile*3;
        
        gp.sObj[gp.mapaAtual][1] = new Buraco();
        gp.sObj[gp.mapaAtual][1].worldX = gp.tamanhoTile*1;
        gp.sObj[gp.mapaAtual][1].worldY = gp.tamanhoTile*2;

        gp.sObj[gp.mapaAtual][3] = new Buraco();
        gp.sObj[gp.mapaAtual][3].worldX = gp.tamanhoTile*7;
        gp.sObj[gp.mapaAtual][3].worldY = gp.tamanhoTile*7;
        
        gp.sObj[gp.mapaAtual][4] = new Porta("Porta1");
        gp.sObj[gp.mapaAtual][4].worldX = gp.tamanhoTile*3;
        gp.sObj[gp.mapaAtual][4].worldY = gp.tamanhoTile*0;
        
        gp.sObj[gp.mapaAtual][5] = new Porta("Porta2");
        gp.sObj[gp.mapaAtual][5].worldX = gp.tamanhoTile*13;
        gp.sObj[gp.mapaAtual][5].worldY = gp.tamanhoTile*0;

        gp.sObj[gp.mapaAtual][6] = new Porta("Porta3");
        gp.sObj[gp.mapaAtual][6].worldX = gp.tamanhoTile*0;
        gp.sObj[gp.mapaAtual][6].worldY = gp.tamanhoTile*3;
        
        }
    else if(gp.mapaAtual == 3){
        gp.sObj[gp.mapaAtual][0] = new Key();
        gp.sObj[gp.mapaAtual][0].worldX = gp.tamanhoTile*5;
        gp.sObj[gp.mapaAtual][0].worldY = gp.tamanhoTile*3;
        
        gp.sObj[gp.mapaAtual][1] = new Porta("Porta1");
        gp.sObj[gp.mapaAtual][1].worldX = gp.tamanhoTile*0;
        gp.sObj[gp.mapaAtual][1].worldY = gp.tamanhoTile*1;
        
        gp.sObj[gp.mapaAtual][2] = new Porta("Porta2");
        gp.sObj[gp.mapaAtual][2].worldX = gp.tamanhoTile*0;
        gp.sObj[gp.mapaAtual][2].worldY = gp.tamanhoTile*3;

        gp.sObj[gp.mapaAtual][3] = new Porta("Porta3");
        gp.sObj[gp.mapaAtual][3].worldX = gp.tamanhoTile*15;
        gp.sObj[gp.mapaAtual][3].worldY = gp.tamanhoTile*0;
        
        gp.sObj[gp.mapaAtual][4] = new Buraco();
        gp.sObj[gp.mapaAtual][4].worldX = gp.tamanhoTile*1;
        gp.sObj[gp.mapaAtual][4].worldY = gp.tamanhoTile*5;

        gp.sObj[gp.mapaAtual][5] = new Buraco();
        gp.sObj[gp.mapaAtual][5].worldX = gp.tamanhoTile*7;
        gp.sObj[gp.mapaAtual][5].worldY = gp.tamanhoTile*7;
        }
    else if(gp.mapaAtual == 4){
        gp.sObj[gp.mapaAtual][0] = new Key();
        gp.sObj[gp.mapaAtual][0].worldX = gp.tamanhoTile*5;
        gp.sObj[gp.mapaAtual][0].worldY = gp.tamanhoTile*3;
        
        gp.sObj[gp.mapaAtual][1] = new Porta("Porta1");
        gp.sObj[gp.mapaAtual][1].worldX = gp.tamanhoTile*3;
        gp.sObj[gp.mapaAtual][1].worldY = gp.tamanhoTile*9;
        
        gp.sObj[gp.mapaAtual][2] = new Porta("Porta2");
        gp.sObj[gp.mapaAtual][2].worldX = gp.tamanhoTile*13;
        gp.sObj[gp.mapaAtual][2].worldY = gp.tamanhoTile*9;

        gp.sObj[gp.mapaAtual][3] = new Porta("Porta3");
        gp.sObj[gp.mapaAtual][3].worldX = gp.tamanhoTile*8;
        gp.sObj[gp.mapaAtual][3].worldY = gp.tamanhoTile*0;
        
        gp.sObj[gp.mapaAtual][4] = new Buraco();
        gp.sObj[gp.mapaAtual][4].worldX = gp.tamanhoTile*8;
        gp.sObj[gp.mapaAtual][4].worldY = gp.tamanhoTile*8;

        gp.sObj[gp.mapaAtual][5] = new Buraco();
        gp.sObj[gp.mapaAtual][5].worldX = gp.tamanhoTile*7;
        gp.sObj[gp.mapaAtual][5].worldY = gp.tamanhoTile*7;
        
        gp.sObj[gp.mapaAtual][6] = new Buraco();
        gp.sObj[gp.mapaAtual][6].worldX = gp.tamanhoTile*5;
        gp.sObj[gp.mapaAtual][6].worldY = gp.tamanhoTile*5;
        
        }
    else if(gp.mapaAtual == 5){
        gp.sObj[gp.mapaAtual][0] = new Key();
        gp.sObj[gp.mapaAtual][0].worldX = gp.tamanhoTile*5;
        gp.sObj[gp.mapaAtual][0].worldY = gp.tamanhoTile*3;
        
        gp.sObj[gp.mapaAtual][1] = new Porta("Porta1");
        gp.sObj[gp.mapaAtual][1].worldX = gp.tamanhoTile*13;
        gp.sObj[gp.mapaAtual][1].worldY = gp.tamanhoTile*0;
        
        gp.sObj[gp.mapaAtual][2] = new Porta("Porta2");
        gp.sObj[gp.mapaAtual][2].worldX = gp.tamanhoTile*3;
        gp.sObj[gp.mapaAtual][2].worldY = gp.tamanhoTile*0;

        gp.sObj[gp.mapaAtual][3] = new Porta("Porta3");
        gp.sObj[gp.mapaAtual][3].worldX = gp.tamanhoTile*0;
        gp.sObj[gp.mapaAtual][3].worldY = gp.tamanhoTile*3;
        
        gp.sObj[gp.mapaAtual][4] = new Buraco();
        gp.sObj[gp.mapaAtual][4].worldX = gp.tamanhoTile*1;
        gp.sObj[gp.mapaAtual][4].worldY = gp.tamanhoTile*2;

        gp.sObj[gp.mapaAtual][5] = new Buraco();
        gp.sObj[gp.mapaAtual][5].worldX = gp.tamanhoTile*7;
        gp.sObj[gp.mapaAtual][5].worldY = gp.tamanhoTile*7;
        
        gp.sObj[gp.mapaAtual][6] = new Buraco();
        gp.sObj[gp.mapaAtual][6].worldX = gp.tamanhoTile*6;
        gp.sObj[gp.mapaAtual][6].worldY = gp.tamanhoTile*7;
        
        gp.sObj[gp.mapaAtual][7] = new Buraco();
        gp.sObj[gp.mapaAtual][7].worldX = gp.tamanhoTile*13;
        gp.sObj[gp.mapaAtual][7].worldY = gp.tamanhoTile*2;
        
        }
    else if(gp.mapaAtual == 6){
        gp.sObj[gp.mapaAtual][0] = new Key();
        gp.sObj[gp.mapaAtual][0].worldX = gp.tamanhoTile*5;
        gp.sObj[gp.mapaAtual][0].worldY = gp.tamanhoTile*3;
        
        gp.sObj[gp.mapaAtual][1] = new Porta("Porta1");
        gp.sObj[gp.mapaAtual][1].worldX = gp.tamanhoTile*0;
        gp.sObj[gp.mapaAtual][1].worldY = gp.tamanhoTile*3;
        
        gp.sObj[gp.mapaAtual][2] = new Porta("Porta2");
        gp.sObj[gp.mapaAtual][2].worldX = gp.tamanhoTile*13;
        gp.sObj[gp.mapaAtual][2].worldY = gp.tamanhoTile*0;

        gp.sObj[gp.mapaAtual][3] = new Porta("Porta3");
        gp.sObj[gp.mapaAtual][3].worldX = gp.tamanhoTile*3;
        gp.sObj[gp.mapaAtual][3].worldY = gp.tamanhoTile*0;
        
        gp.sObj[gp.mapaAtual][4] = new Buraco();
        gp.sObj[gp.mapaAtual][4].worldX = gp.tamanhoTile*3;
        gp.sObj[gp.mapaAtual][4].worldY = gp.tamanhoTile*2;

        gp.sObj[gp.mapaAtual][5] = new Buraco();
        gp.sObj[gp.mapaAtual][5].worldX = gp.tamanhoTile*7;
        gp.sObj[gp.mapaAtual][5].worldY = gp.tamanhoTile*3;
        
        gp.sObj[gp.mapaAtual][6] = new Buraco();
        gp.sObj[gp.mapaAtual][6].worldX = gp.tamanhoTile*6;
        gp.sObj[gp.mapaAtual][6].worldY = gp.tamanhoTile*6;
        
        gp.sObj[gp.mapaAtual][7] = new Buraco();
        gp.sObj[gp.mapaAtual][7].worldX = gp.tamanhoTile*13;
        gp.sObj[gp.mapaAtual][7].worldY = gp.tamanhoTile*4;
        
        gp.sObj[gp.mapaAtual][8] = new Buraco();
        gp.sObj[gp.mapaAtual][8].worldX = gp.tamanhoTile*11;
        gp.sObj[gp.mapaAtual][8].worldY = gp.tamanhoTile*2;
        
        }
    else if(gp.mapaAtual == 7){
        gp.sObj[gp.mapaAtual][0] = new Key();
        gp.sObj[gp.mapaAtual][0].worldX = gp.tamanhoTile*5;
        gp.sObj[gp.mapaAtual][0].worldY = gp.tamanhoTile*3;
        
        gp.sObj[gp.mapaAtual][1] = new Porta("Porta1");
        gp.sObj[gp.mapaAtual][1].worldX = gp.tamanhoTile*0;
        gp.sObj[gp.mapaAtual][1].worldY = gp.tamanhoTile*4;
        
        gp.sObj[gp.mapaAtual][2] = new Porta("Porta2");
        gp.sObj[gp.mapaAtual][2].worldX = gp.tamanhoTile*16;
        gp.sObj[gp.mapaAtual][2].worldY = gp.tamanhoTile*3;

        gp.sObj[gp.mapaAtual][3] = new Porta("Porta3");
        gp.sObj[gp.mapaAtual][3].worldX = gp.tamanhoTile*16;
        gp.sObj[gp.mapaAtual][3].worldY = gp.tamanhoTile*6;
        
        gp.sObj[gp.mapaAtual][4] = new Buraco();
        gp.sObj[gp.mapaAtual][4].worldX = gp.tamanhoTile*1;
        gp.sObj[gp.mapaAtual][4].worldY = gp.tamanhoTile*5;

        gp.sObj[gp.mapaAtual][5] = new Buraco();
        gp.sObj[gp.mapaAtual][5].worldX = gp.tamanhoTile*8;
        gp.sObj[gp.mapaAtual][5].worldY = gp.tamanhoTile*8;
        
        gp.sObj[gp.mapaAtual][6] = new Buraco();
        gp.sObj[gp.mapaAtual][6].worldX = gp.tamanhoTile*6;
        gp.sObj[gp.mapaAtual][6].worldY = gp.tamanhoTile*6;
        
        gp.sObj[gp.mapaAtual][7] = new Buraco();
        gp.sObj[gp.mapaAtual][7].worldX = gp.tamanhoTile*13;
        gp.sObj[gp.mapaAtual][7].worldY = gp.tamanhoTile*3;
        
        gp.sObj[gp.mapaAtual][8] = new Buraco();
        gp.sObj[gp.mapaAtual][8].worldX = gp.tamanhoTile*12;
        gp.sObj[gp.mapaAtual][8].worldY = gp.tamanhoTile*4;

        gp.sObj[gp.mapaAtual][9] = new Buraco();
        gp.sObj[gp.mapaAtual][9].worldX = gp.tamanhoTile*10;
        gp.sObj[gp.mapaAtual][9].worldY = gp.tamanhoTile*6;
        
        }
    else if(gp.mapaAtual == 8){
        gp.sObj[gp.mapaAtual][0] = new Key();
        gp.sObj[gp.mapaAtual][0].worldX = gp.tamanhoTile*5;
        gp.sObj[gp.mapaAtual][0].worldY = gp.tamanhoTile*2;
        
        gp.sObj[gp.mapaAtual][1] = new Porta("Porta1");
        gp.sObj[gp.mapaAtual][1].worldX = gp.tamanhoTile*3;
        gp.sObj[gp.mapaAtual][1].worldY = gp.tamanhoTile*0;
        
        gp.sObj[gp.mapaAtual][2] = new Porta("Porta2");
        gp.sObj[gp.mapaAtual][2].worldX = gp.tamanhoTile*13;
        gp.sObj[gp.mapaAtual][2].worldY = gp.tamanhoTile*0;

        gp.sObj[gp.mapaAtual][3] = new Porta("Porta3");
        gp.sObj[gp.mapaAtual][3].worldX = gp.tamanhoTile*0;
        gp.sObj[gp.mapaAtual][3].worldY = gp.tamanhoTile*3;
        
        gp.sObj[gp.mapaAtual][4] = new Buraco();
        gp.sObj[gp.mapaAtual][4].worldX = gp.tamanhoTile*7;
        gp.sObj[gp.mapaAtual][4].worldY = gp.tamanhoTile*5;

        gp.sObj[gp.mapaAtual][5] = new Buraco();
        gp.sObj[gp.mapaAtual][5].worldX = gp.tamanhoTile*7;
        gp.sObj[gp.mapaAtual][5].worldY = gp.tamanhoTile*8;
        
        gp.sObj[gp.mapaAtual][6] = new Buraco();
        gp.sObj[gp.mapaAtual][6].worldX = gp.tamanhoTile*7;
        gp.sObj[gp.mapaAtual][6].worldY = gp.tamanhoTile*6;
        
        gp.sObj[gp.mapaAtual][7] = new Buraco();
        gp.sObj[gp.mapaAtual][7].worldX = gp.tamanhoTile*8;
        gp.sObj[gp.mapaAtual][7].worldY = gp.tamanhoTile*4;
        
        gp.sObj[gp.mapaAtual][8] = new Buraco();
        gp.sObj[gp.mapaAtual][8].worldX = gp.tamanhoTile*9;
        gp.sObj[gp.mapaAtual][8].worldY = gp.tamanhoTile*2;

        gp.sObj[gp.mapaAtual][9] = new Buraco();
        gp.sObj[gp.mapaAtual][9].worldX = gp.tamanhoTile*9;
        gp.sObj[gp.mapaAtual][9].worldY = gp.tamanhoTile*6;
        
        }
    else if(gp.mapaAtual == 9){
        gp.sObj[gp.mapaAtual][0] = new Key();
        gp.sObj[gp.mapaAtual][0].worldX = gp.tamanhoTile*5;
        gp.sObj[gp.mapaAtual][0].worldY = gp.tamanhoTile*3;
        
        gp.sObj[gp.mapaAtual][1] = new Porta("Porta1");
        gp.sObj[gp.mapaAtual][1].worldX = gp.tamanhoTile*0;
        gp.sObj[gp.mapaAtual][1].worldY = gp.tamanhoTile*3;
        
        gp.sObj[gp.mapaAtual][2] = new Porta("Porta2");
        gp.sObj[gp.mapaAtual][2].worldX = gp.tamanhoTile*3;
        gp.sObj[gp.mapaAtual][2].worldY = gp.tamanhoTile*0;

        gp.sObj[gp.mapaAtual][3] = new Porta("Porta3");
        gp.sObj[gp.mapaAtual][3].worldX = gp.tamanhoTile*13;
        gp.sObj[gp.mapaAtual][3].worldY = gp.tamanhoTile*0;
        
        gp.sObj[gp.mapaAtual][4] = new Buraco();
        gp.sObj[gp.mapaAtual][4].worldX = gp.tamanhoTile*2;
        gp.sObj[gp.mapaAtual][4].worldY = gp.tamanhoTile*1;

        gp.sObj[gp.mapaAtual][5] = new Buraco();
        gp.sObj[gp.mapaAtual][5].worldX = gp.tamanhoTile*3;
        gp.sObj[gp.mapaAtual][5].worldY = gp.tamanhoTile*3;
        
        gp.sObj[gp.mapaAtual][6] = new Buraco();
        gp.sObj[gp.mapaAtual][6].worldX = gp.tamanhoTile*7;
        gp.sObj[gp.mapaAtual][6].worldY = gp.tamanhoTile*5;
        
        gp.sObj[gp.mapaAtual][7] = new Buraco();
        gp.sObj[gp.mapaAtual][7].worldX = gp.tamanhoTile*1;
        gp.sObj[gp.mapaAtual][7].worldY = gp.tamanhoTile*4;
        
        gp.sObj[gp.mapaAtual][8] = new Buraco();
        gp.sObj[gp.mapaAtual][8].worldX = gp.tamanhoTile*7;
        gp.sObj[gp.mapaAtual][8].worldY = gp.tamanhoTile*7;

        gp.sObj[gp.mapaAtual][9] = new Buraco();
        gp.sObj[gp.mapaAtual][9].worldX = gp.tamanhoTile*10;
        gp.sObj[gp.mapaAtual][9].worldY = gp.tamanhoTile*3;
        }
        
    }
}