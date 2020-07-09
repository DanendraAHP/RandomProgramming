public class Rectangle extends Shape {
  
    // Memiliki 4 point
    // Pre-kondisi semua point tidak berda pada titik yang sama dan tidak segaris
    public Rectangle(Point[] p){
        this.p = new Point[4];
        for(int i = 0;i<p.length;i++){
            this.p[i]=p[i];

        }
        this.size = 4;
    }
  
    // Melakukan implementasi fungsi keliling
    // Keliling lingkaran = 2 * pi * radius. Gunakan pi = 3.14
    public double keliling(){
        return(2*(p[0].distance(p[1]) + p[1].distance(p[2])));
    }
  
    // Mencetak segiempat ke layar
    // Jika koordinat segitiga adalah (3,0), (0,4), (2,3), dan (0,0), maka hasilnya adalah sebagai berikut
    // (3,0)
    // (0,4)
    // (2,3)
    // (0,0)
    // segiempat
    public void print(){
        for(int i = 0;i<p.length;i++){
            p[i].print();

        }
        System.out.println("segiempat");
    }
  }
  