public class RegularUser extends User {

    public RegularUser(String name){
        super(name,0);
    }
  
    // mencetak "<name>: Regular User."
    public void print(){
        System.out.println(name+": Regular User");
    }
    
    // mencetak "<name> now listening to <song>."
    public void listen(String song){
        System.out.println(name+": now listening to "+ song);
    }
  
    // mencetak "<name> is not a premium user."
    public void download(String song){
        System.out.println(name+"is not a premium user");
    }
  
    // mengembalikan 0
    public int getPrice(){
        return 0;
    }
  }