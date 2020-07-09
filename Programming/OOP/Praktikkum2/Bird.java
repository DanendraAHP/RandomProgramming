public class Bird extends Animal {
    // Melakukan assign numberOfLegs = 2 dan posisi pada x = 0, y = 0
    public Bird(){
        super(2,0,0);
    }

    // Melakukan assign numberOfLegs = 2 dan posisi pada x, y
    // Jika posisi tidak valid, nilai y posisi dipindahkan ke nilai y terdekat yang valid.
    public Bird(int x, int y){
        super(0,x,y);
        if(y<0){
            setPosition(x,0);
        }
    }

    // Mencetak suara burung, "tweet..tweet.."
    public void makeSound(){
        System.out.println("tweet..tweet..");
    }

    // Terbang sejauh nilai x dan y
    // Jika y tidak valid, nilai y dirubah ke nilai y terdekat yang valid.
    public void move(int x, int y){
        if (y+position.getY()<0){
            movePosition(x,0);;
        }else{
            movePosition(x,y);
        }
        
    }

    // Melakukan pencetakan dengan format 
    // "Hewan ini berkaki 2 dan Hewan ini adalah burung"
    // "Posisi: x, y"
    public void print(){
        System.out.println("Hewan ini berkaki 2 dan Hewan ini adalah burung");
        System.out.println("Posisi: "+this.position.getX()+", "+this.position.getY());
    }
}
