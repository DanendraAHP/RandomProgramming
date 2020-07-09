public class Fish extends Animal {
    // Melakukan assign numberOfLegs = 0 dan posisi pada x = 0, y = -1
    public Fish(){
        super(0,0,-1);
    }

    // Melakukan assign numberOfLegs = 0 dan posisi pada x, y
    // Jika posisi tidak valid, nilai y posisi dipindahkan ke nilai y terdekat yang valid.
    public Fish(int x, int y){
        super(0,x,y);
        if(y>-1){

            setPosition(x,-1);
        }
        
    }

    // Mencetak suara burung, "bloob..bloob.."
    public void makeSound(){
        System.out.println("bloob..bloob..");
    }

    // Menyelam sejauh nilai x dan y
    // Jika y tidak valid, nilai y dirubah ke nilai y terdekat yang valid.
    public void move(int x, int y){
        if (y+position.getY()>-1){
            movePosition(x,-1);;
        }else{
            movePosition(x,y);
        }
        
    }

    // Melakukan pencetakan dengan format 
    // "Hewan ini berkaki 0 dan Hewan ini adalah ikan"
    // "Posisi: x, y"
    public void print(){
        System.out.println("Hewan ini berkaki 0 dan Hewan ini adalah ikan");
        System.out.println("Posisi: "+this.position.getX()+", "+this.position.getY());
    }
}
