
public class Circle extends Shape {
  
    private int radius;
  
    // Point yang diisi adalah titik pusat dari lingkaran tersebut
    // Lingkaran hanya memiliki 1 point pusat
    public Circle(int r, Point p){
        this.p = new Point[1];
        this.p[0] = p;
        this.radius = r;
    }
  
    // Melakukan implementasi fungsi keliling
    // Keliling lingkaran = 2 * pi * radius. Gunakan pi = 3.14
    public double keliling(){
        return( 2*3.14*radius) ;
    }
  
    // Mencetak lingkaran ke layar
    // Jika titik pusat lingkaran adalah (0,0) dan radius nya 5, maka hasilnya adalah sbg berikut
    // (0,0)
    // r = 5
    // lingkaran
    public void print(){
        System.out.println(p[0]);
        System.out.println(radius);
        System.out.println("Lingkaran");
    }
}
