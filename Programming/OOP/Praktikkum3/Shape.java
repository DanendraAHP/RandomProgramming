public abstract class Shape {
    protected Point[] p;
    protected int size;
  
    // Mengeluarkan nilai point ke-n
    // Pre kondisi: n < size;
    public Point getPoint(int n){
        return this.p[n];
    }
  
    // Set nilai point ke n dengan p2
    public void setPoint(int n, Point p2){
        this.p[n] = p2;
    }
  
    // Set nilai point ke n dengan (x,y)
    public void setPoint(int n, int x, int y){
        this.p[n].setAbsis(x);
        this.p[n].setOrdinat(y);
    }
  
    // Melakukan pergeseran bidang sebesar point p2
    public void translate(Point p2){
        for(int i=0;i<p.length;i++){
            p[i].translate(p2);
        }
    }
  
    // Melakukan pergeseran bidang sebesar (x,y)
    public void translate(int x, int y){
        for(int i=0;i<p.length;i++){
            p[i].translate(x,y);
        }
    }
  
    // Menghitung keliling bidang
    public abstract double keliling();
  
    // melakukan pencetakan bidang.
    public abstract void print();
}
