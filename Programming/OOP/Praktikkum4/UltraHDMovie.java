
public class UltraHDMovie implements Movie {
    private String nama;
    public UltraHDMovie(String nama){
        this.nama = nama;
    }
    
    public String getType(){
        return ("UltraHDMovie");
    }
    public String getName(){
        return nama;
    }
}