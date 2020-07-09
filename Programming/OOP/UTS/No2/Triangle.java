public class Triangle extends Shape {
  
    // memanggil konstruktor Shape dengan nilai n = 3
    public Triangle(){
        super(3);
    }
  
    // menghasilkan true jika segitiga yang dibentuk adalah segitiga sama sisi
    public boolean isSamaSisi(){
        return( ( p[0].distance(p[1]) == p[1].distance(p[2]) ) && ( p[0].distance(p[2])== p[2].distance(p[1]) ) );
    }
  
    // mencetak segitiga ke layar
    // jika koordinat segitiga adalah (3,0), (0,4), dan (0,0), maka hasilnya adalah sebagai berikut
    // (3,0)
    // (0,4)
    // (0,0)
    // segitiga
    public void print(){
        for (int i=0;i<size;i++){
            p[i].print();
        }
        System.out.println("segitiga");
    }
  }