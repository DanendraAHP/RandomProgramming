class Nasabah {
    private String nama;
    private int tahunLahir;
    private String kota;
    private String pin;
  
    public Nasabah (String nama, int tahunLahir, String kota, String pin){
        this.nama = nama;
        this.tahunLahir = tahunLahir;
        this.kota = kota;
        this.pin = pin;
    }
  
    // Mendapatkan umur dari nasabah
    public int getUmur(){
         return(2020-tahunLahir);
    }
  
    // Menuliskan informasi nasabah
    public void printInfo(){
        System.out.println("Nama: "+nama);
        System.out.println("Kota: "+kota);
        System.out.println("Umur: "+getUmur()+" tahun" );
        System.out.println("Ping: "+pin);
    }
  
    // Membandingkan nilai pin masukan dengan nilai pin nasabah
    public boolean isPinMatch(String pin){
        if (this.pin.equals(pin)){
            System.out.println('bener');
            return true;
        }else{
            System.out.println('salah');
            return false;
        }
    }

    public static void main(final String[] args) {
        Nasabah Danen = new Nasabah("Danendra",2000,"Jakarta","110800");
        Danen.getUmur();
        Danen.printInfo();
        Danen.isPinMatch("110800");
    }
  }