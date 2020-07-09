class User {
  private int balance;
  private Subscription subscription;
  private String username;

  public User(String username){
    this.username = username;
    this.balance = 0;
    this.subscription = new FreeSubscription();

  }
  public User(String username, int balance){
    this.username = username;
    this.balance = balance;
    this.subscription = new FreeSubscription();
  }

  public String getUsername(){
    return username;
  }
  public Subscription getSubscription(){
    return subscription;
  }

  public void setSubscription(Subscription subscription){
    this.subscription = subscription;
  }

  // Mengeluarkan true jika User dapat menonton movie, dan menuliskan "Selamat menonton"
  // Menuliskan "Kamu perlu Premium Subscription untuk menonton ini" jika 
  // User tidak memiliki tipe Subscription yang tepat
  public boolean watch(Movie movie){
    if (movie.getType().equals("UltraHDMovie") && subscription.getType().equals("Free")){
      return false;
    }else{
      return true;
    }
  }

  // Menambahkan balance user
  public void addBalance(int balance){
    this.balance += balance;
  }
  public int getBalance(){
    return balance;
  }

  // Mengurangi balance user sesuai dengan tipe subscription
  // Mengeluarkan false jika user tidak memiliki balance cukup
  public boolean bill(){
    if(balance < subscription.getBillAmount()){
      return false;
    }else{
      this.balance -= subscription.getBillAmount();
      return true;
    }
  }
}
