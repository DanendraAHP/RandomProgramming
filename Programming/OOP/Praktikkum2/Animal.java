import java.lang.Math;

public class Animal {
    protected int numberOfLegs;
    protected Point position; 
    
    // Membuat Animal dengan jumlah kaki yang berdiri di titik (x, y)
    public Animal(int numberOfLegs, int x, int y){
        Point p = new Point(x,y);
        this.position = p;
        this.numberOfLegs = numberOfLegs;
    }

    // Mengeluarkan standpoint dari Animal
    public Point getPosition(){
        return position;
    }

    // Posisi Animal diassign dengan p
    public void setPosition(Point p){
        this.position = p;
    }

    // Posisi Animal diassign dengan (x, y);
    public void setPosition(int x, int y){
        Point p = new Point(x,y);
        this.position = p; 
    }

    // Posisi Animal berubah sebesar p
    public void movePosition(Point p){
        Point p2 = new Point(position.getX()+p.getX(), position.getY()+p.getY());
        this.position = p2;
    }

    // Posisi Animal berubah sebesar (x,y)
    public void movePosition(int x, int y){
        Point p2 = new Point(position.getX()+x, position.getY()+y);
        this.position = p2;
    }

    // Menghitung jarak antara Animal dengan titik (0,0)
    public double distanceFromZero(){
        double jarak = Math.pow(this.position.getX(),2)+Math.pow(this.position.getY(),2);
        return (Math.sqrt(jarak));
    }

    // Melakukan pencetakan dengan format "Hewan ini berkaki X"
    public void print(){
        System.out.println("Hewan ini berkaki "+numberOfLegs);
    }
}
