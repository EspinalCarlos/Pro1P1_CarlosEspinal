package pro1p1_carlosespinal;

public class Cancion {

    private String cancion;
    private String album;
    private String artista;
    private int fecha;
    private int duracion;

    public Cancion(String song, String albumm, String artist, int date, int dura) {
        this.cancion = song;
        System.out.println(cancion);
        this.album = albumm;
        System.out.println(album);

        this.artista = artist;
        System.out.println(artista);
        this.fecha = date;
        System.out.println(fecha);
        this.duracion = dura;
        System.out.println(duracion);
    }

    public String getCancion() {
        return cancion;
    }

    public void setCancion(String cancion) {
        this.cancion = cancion;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String conseguirString(int index) {
        int aindex = index + 1;
        String resp = "Informacion\n\n";
        resp += "Cancion #"+aindex+ "\n";
        resp += "Nombre de la Cancion: "+cancion+"\n";
        resp += "Nombre del album: "+album+"\n";
        resp += "Nombre del artista: "+artista+"\n";
        resp += "Fecha de lanzamiento: "+fecha+"\n";
        if (duracion > 1) {
            resp += "Duracion de la cancion: "+duracion+" minutos"+"\n\n";
        }
        else {
            resp += "Duracion de la cancion: "+duracion+" minuto"+"\n\n";
        }
        

        return resp;
    }

}
