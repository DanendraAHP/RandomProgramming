import java.util.Scanner;
class Rekening {
    private static int jumlahRekeningTerdaftar;
    private int nomorRekening;
    private int saldo;
    private Nasabah nasabah;
  
    public Rekening(Nasabah nasabah, int saldo){
        this.nasabah = nasabah;
        this.saldo = saldo;
        this.nomorRekening = this.jumlahRekeningTerdaftar+1;
        this.jumlahRekeningTerdaftar += 1 ;

    }
    
    public void transfer(Rekening rekening, int jumlah, String pin){
        if (this.saldo>=jumlah){
            if(this.nasabah.isPinMatch(pin) ){
                System.out.println("Operasi Sukses");
                this.saldo -= jumlah ;
                rekening.saldo += jumlah;
            }
            else{
                System.out.println("Pin salah");
            }
        }
        else{
            System.out.println("Saldo tidak mencukupi");
        }
    }
  
    public void withdraw(int jumlah, String pin){
        if (this.nasabah.isPinMatch(pin)){
            if(this.saldo >= jumlah ){
                System.out.println("Operasi Sukses");
                this.saldo -= jumlah ;
            }
            else{
                System.out.println("Saldo tidak mencukupi");
            }
        }
        else{
            System.out.println("Pin salah");
        }
    }
  
    public void printInfo(){
        System.out.println("No. Rekening: "+nomorRekening);
        System.out.println("Saldo: "+saldo);
        nasabah.printInfo();

    }
  
    public int getNomorRekening(){
        return this.nomorRekening;
    }
  
    public int getSaldo(){
        return this.saldo;
    }

    public static Rekening daftar(Nasabah nasabah, int saldo){
        if(nasabah != null && saldo > 50000){
            Rekening rek = new Rekening(nasabah,saldo); 
            return rek;
        }else{
            return null;
        }
    }

    

    
}