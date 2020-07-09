public abstract class User implements OnlineMusic {
    protected String name; // nama user
    protected int type; // 0: regular user, 1: premium user
  
    public User(String name, int type){
        this.name = name;
        this.type = type;
    }
    public int getType(){
        return this.type;
    }
    public String getName(){
        return this.name;
    }
  
    // method abstract, diimplementasikan oleh kelas turunan
    public abstract void print();
    public abstract void listen(String song);
    public abstract void download(String song);
    public abstract int getPrice();
  }