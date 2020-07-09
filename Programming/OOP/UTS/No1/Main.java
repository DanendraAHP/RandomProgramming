import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int x1 = inp.nextInt();
        int y1 = inp.nextInt();

        int x2 = inp.nextInt();
        int y2 = inp.nextInt();

        Point p1 = new Point(x1,y1);
        Point p2 = new Point(x2,y2);

        p1.print();
        p2.print();

        boolean ori = p1.isOrigin();
        if(ori){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

        boolean eq = p1.isEqual(p2);
        if(eq){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

        if(p1.isOrigin()){
            System.out.println("-1");
        }else{
            System.out.println(p1.kuadran());
        }
        Point origin = new Point();
        System.out.println(p1.distance(origin));
        p1.translate(p2);
        p1.print();

        int x3 = inp.nextInt();
        int y3 = inp.nextInt();

        p1.translate(x3, y3);
        p1.print();

        
    }
}