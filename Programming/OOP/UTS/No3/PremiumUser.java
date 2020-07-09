import java.util.ArrayList;
public class PremiumUser extends User {
    protected ArrayList<String> songList;
  
    // menginstantiasi kosong songList
    public PremiumUser(String name){
        super(name , 1);
        songList = new ArrayList<String>(); 
    }
  
    // mencetak "<name>: Premium User. Last song: <song>."
    // song adalah lagu terakhir yang didengarkan
    // jika belum ada, <song> bernilai string kosong
    public void print(){
        if(songList.size()>0){
            System.out.println(name+": Premium User. Last song: "+songList.get(songList.size()-1));
        }else{
            System.out.println(name+": Premium User. Last song: ");
        }
       
    }
  
    // mencetak "<name> now listening to <song>."
    // lalu menambahkan <song> ke <songList>
    public void listen(String song){
        System.out.println(name + " now listening to "+ song+".");
        songList.add(song);
    }
  
    // mencetak "<name> download <song>."
    // lalu menambahkan <song> ke <songList>
    public void download(String song){
        System.out.println(name + " download "+ song+".");
        songList.add(song);
    }
  
    // mencetak seluruh lagu yang pernah ditambahkan ke songList
    // format print:
    // <No>. <Judul musik><endl>
    // contoh:
    // 1. Starship - Nicki Minaj
    // 2. To Be Human - Sia, Labrinth
    // jika songList kosong, tidak mencetak apapun ke layar
    public void showSongList(){
        if(songList.size()>0){
            for(int i=0;i<songList.size();i++){
                System.out.println(i+". "+songList.get(i));
            }
        }
    }
  
  
    // mengembalikan harga penyewaan
    // harga penyewaan = jumlah lagu pada songList * 1000
    public int getPrice(){
        return 1000*songList.size();
    }
  }