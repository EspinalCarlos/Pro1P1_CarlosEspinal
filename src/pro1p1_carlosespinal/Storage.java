
package pro1p1_carlosespinal;
import java.util.ArrayList;

public class Storage {
    public static ArrayList<Cancion> canciones = new ArrayList<>();
    
    public static void registerSong(String Song, String Album, String Artista, int Año, int Duracion ) {
         canciones.add(new Cancion(Song, Album, Artista, Año, Duracion));
        
    }
    public static String getSong() {
        String rSong = "";
        
        for (Cancion cancionn : canciones) {
            rSong = rSong +(canciones.indexOf(cancionn)+1)+". "+cancionn.getCancion()+" by "+cancionn.getArtista()+"\n";
            
        }
        return rSong;
    }
    
    public static String getSongdet(int index) {
        System.out.println(canciones.toString());
        Cancion c = canciones.get(index);
        
         return c.conseguirString(index);
    }
    
    public static void removeSong(int index) {
        canciones.remove(index);
        
    }
    
}
