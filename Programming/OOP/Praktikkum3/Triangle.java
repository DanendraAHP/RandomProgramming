public class Triangle extends Shape {
  
    // Memiliki 3 point
    // Pre-kondisi semua point tidak berada pada titik yang sama dan tidak segaris
    public Triangle(Point[] p){
        this.p = new Point[3];
        for(int i = 0;i<p.length;i++){
            this.p[i]=p[i];

        }
        this.size = 3;
    }
  
    // Menghasilkan true jika segitiga yang dibentuk adalah segitiga sama sisi
    public boolean isSamaSisi(){
        double j1 = p[0].distance(p[1]) ;
        double j2 = p[1].distance(p[2]) ;
        double j3 = p[2].distance(p[0]) ;
        if (j1==j2 && j2==j3){
            return true;
        }else{
            return false;
        }
    }

    // Menghasilkan true jika segitiga yang dibentuk adalah segitiga sama kaki
    public boolean isSamaKaki(){
        double j1 = p[0].distance(p[1]) ;
        double j2 = p[1].distance(p[2]) ;
        double j3 = p[2].distance(p[0]) ;

        if(j1==j2 || j2==j3 || j1==j3){
            return true;
        }else{
            return false;
        }
    }

    // Melakukan implementasi fungsi keliling
    public double keliling(){
        return (p[0].distance(p[1]) + p[1].distance(p[2]) + p[0].distance(p[2]));
    }
  
    // Mencetak segitiga ke layar
    // Jika koordinat segitiga adalah (3,0), (0,4), dan (0,0), maka hasilnya adalah sebagai berikut
    // (3,0)
    // (0,4)
    // (0,0)
    // segitiga
    public void print(){
        for(int i = 0;i<p.length;i++){
            p[i].print();

        }
        System.out.println("segitiga");
    }
}
