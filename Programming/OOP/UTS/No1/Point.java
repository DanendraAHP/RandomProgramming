public class Point {
    private int x, y; // absis dan ordinat

    // Constructor
    // Set titik mula-mula ke (0, 0)
    public Point(){
        this.x = 0;
        this.y = 0;
    }

    // Set titik mula-mula ke (x, y)
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    // Getter
    public int getAbsis(){
        return x;
    }
    public int getOrdinat(){
        return y;
    }

    // Setter
    public void setAbsis(int x){
        this.x = x;
    }
    public void setOrdinat(int y){
        this.y = y;
    }

    // Menghasilkan true jika titik (x, y) berada di (0, 0)
    public boolean isOrigin(){
        if (getAbsis()==x && getOrdinat()==0){
            return true;
        }else{
            return false;
        }
    }

    // Menghasilkan true jika titik pada argumen sama dengan dirinya
    public boolean isEqual(Point p){
        if(this.x==p.x && this.y==p.y){
            return true;
        }else{
            return false;
        }
    }

    // Mengubah titik dengan penambahan Point argumen
    public void translate(Point p){
        this.x += p.x;
        this.y += p.y;
    }

    // Mentranslasikan titik sebesar (x, y)
    public void translate(int x, int y){
        this.x += x;
        this.y += y;
    }

    // Menghasilkan nomor kuadran dari titik sekarang
    // Sebuah titik yang berada pada sumbu x atau y tidak akan dicoba
    public int kuadran(){
        if (x > 0){
            if (y > 0){
                return 1;
            } else{
                return 4;
            }
        } else{
            if (y > 0){
                return 2;
            } else{
                return 3;
            }
        }
    }

    // Menghasilkan jarak antara titik sekarang dengan Point argumen
    public double distance(Point p){
        return Math.sqrt((this.x - p.x) * (this.x - p.x) + (this.y - p.y) * (this.y - p.y));
    }

    // Menuliskan titik ke layar dengan format "(x,y)"
    public void print(){
        System.out.println("("+this.x+","+this.y+")");
    }
}