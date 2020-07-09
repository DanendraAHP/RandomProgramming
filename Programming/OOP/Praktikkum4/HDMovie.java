
public class HDMovie implements Movie{
    private String nama;
    public HDMovie(String nama){
        this.nama = nama;
    }
    
    public String getType(){
        return ("HDMovie");
    }
    public String getName(){
        return nama;
    }
}