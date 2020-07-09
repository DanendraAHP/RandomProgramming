import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan point 1");
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        Point p1 = new Point(x1, y1);

        System.out.println("Masukkan point 2");
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        Point p2 = new Point(x2, y2);

        System.out.println("Masukkan point 2");
        int x3 = input.nextInt();
        int y3 = input.nextInt();
        Point p3 = new Point(x3, y3);

        Monkey monyet = new Monkey();
        Bird burung = new Bird();
        Fish ikan = new Fish();

        
        monyet.move(x1, y1);
        burung.move(x1,y1);
        ikan.move(x1, y1);

        monyet.move(x2, y2);
        burung.move(x2,y2);
        ikan.move(x2, y2);

        monyet.move(x3, y3);
        burung.move(x3,y3);
        ikan.move(x3, y3);

        int n1 = input.nextInt();
        for(int i=0;i<n1;i++){
            ikan.makeSound();
        }

        int n2 = input.nextInt();
        for(int i=0;i<n2;i++){
            monyet.makeSound();
        }

        int n3 = input.nextInt();
        for(int i=0;i<n3;i++){
            burung.makeSound();
        }

        ikan.print();
        burung.print();
        monyet.print();

    }
            
        
    

        
        
        
        
    
}