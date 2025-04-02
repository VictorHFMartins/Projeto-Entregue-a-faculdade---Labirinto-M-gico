
package a3.modelo.mapas;

import a3.modelo.main.GamePainel;
import java.io.FileNotFoundException;

public class mapas {
    
    public String[] mapa = new String[10];

    public mapas() {
        initMap();
    }
    
    public void initMap(){
        mapa[0] = "/maps/Map01.txt";
        mapa[1] = "/maps/Map02.txt";
        mapa[2] = "/maps/Map03.txt";
        mapa[3] = "/maps/Map04.txt";
        mapa[4] = "/maps/Map05.txt";
        mapa[5] = "/maps/Map06.txt";
        mapa[6] = "/maps/Map07.txt";
        mapa[7] = "/maps/Map08.txt";
        mapa[8] = "/maps/Map09.txt";
        mapa[9] = "/maps/Map10.txt";
    }
    
    public String getMapas(int num){
        switch(num){
            case 0 : return mapa[0];
            case 1 : return mapa[1];
            case 2 : return mapa[2];
            case 3 : return mapa[3];
            case 4 : return mapa[4];
            case 5 : return mapa[5];
            case 6 : return mapa[6];
            case 7 : return mapa[7];
            case 8 : return mapa[8];
            case 9 : return mapa[9];
        }
        return null;
    }
    
}
